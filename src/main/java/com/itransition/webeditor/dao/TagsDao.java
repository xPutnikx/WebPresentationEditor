package com.itransition.webeditor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.annotations.Index;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	@Cacheable("tags")
	@SuppressWarnings("unchecked")
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
	
}	
	