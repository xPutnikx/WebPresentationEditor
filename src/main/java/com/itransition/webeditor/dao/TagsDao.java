package com.itransition.webeditor.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.util.Version;
import org.hibernate.EntityMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.itransition.webeditor.model.Tags;

@Repository
public class TagsDao {	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	@Cacheable("tags")
	public Tags findById(Long id) {
		return entityManager.find(Tags.class, id);
	}
	
	@Transactional	
	@SuppressWarnings("unchecked")
	@Cacheable("tags")	
	public Long findIdByName(String name) {
		List<Long> result = entityManager.createQuery(
				"select t.id from Tags t where t.name='" + name + "'")
				.getResultList();
		if (result.size() != 0) {
			return result.get(0);
		}
		return null;
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	@Cacheable("tags")
	public List<String> searchByName(String name) {
		return entityManager.createQuery(
				"select t.name from Tags t where t.name like '%" + 
				name + "%'").getResultList();		
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	@Cacheable("tags")	
	public List<Tags> getTags() {
		return entityManager.createQuery(
				"select t from Tags t").getResultList();
	}

	@Transactional
	@CacheEvict(value = "tags", allEntries = true)
	public void save(Tags tags) {
		if (tags.getId() == null) {
			entityManager.persist(tags);			
		} else {
			entityManager.merge(tags);
		}
	}
	
	@Transactional
	@CacheEvict(value = "tags", allEntries = true)
	public void removeById(Long id) {
		Tags tags = entityManager.find(Tags.class, id);
		entityManager.remove(tags);
	}
	@Transactional
	@CacheEvict(value = "tags", allEntries = true)
	public void luceneSearch() throws ParseException{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("acme");
		EntityManager em = emf.createEntityManager();
		
	FullTextEntityManager fullTextEntityManager = 
	    org.hibernate.search.jpa.Search.getFullTextEntityManager(em);
	// create native Lucene query
	String[] fields = new String[]{"name"};
	StandardAnalyzer analyzer = new StandardAnalyzer(Version.LUCENE_35);
	MultiFieldQueryParser parser = new MultiFieldQueryParser(Version.LUCENE_35, fields, analyzer);
	org.apache.lucene.search.Query query = parser.parse( "sise4ki" );
	javax.persistence.Query persistenceQuery = fullTextEntityManager.createFullTextQuery(query, Tags.class);

	// execute search
	List result = persistenceQuery.getResultList();
	System.out.println(result);
	em.getTransaction().commit();
	}
}	
	