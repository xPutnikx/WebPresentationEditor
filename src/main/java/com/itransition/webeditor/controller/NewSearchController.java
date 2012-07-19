package com.itransition.webeditor.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itransition.webeditor.model.Tags;

@Controller
public class NewSearchController {
	private static final Logger logger = LoggerFactory
			.getLogger(NewSearchController.class);
	@Autowired
	EntityManagerFactory entityManagerFactory;

	@RequestMapping(value = "newsearch", method = RequestMethod.GET)
	public void search(Model model) throws InterruptedException {
		EntityManager em = entityManagerFactory.createEntityManager();
		FullTextEntityManager fullTextEntityManager = 
		    org.hibernate.search.jpa.Search.getFullTextEntityManager(em);
		em.getTransaction().begin();
		QueryBuilder qb = fullTextEntityManager.getSearchFactory()
		    .buildQueryBuilder().forEntity( Tags.class ).get();
		org.apache.lucene.search.Query query = qb
		  .keyword()
		  .onFields("name")
		  .matching("1111")
		  .createQuery();
		javax.persistence.Query persistenceQuery = 
		    fullTextEntityManager.createFullTextQuery(query, Tags.class);
		List result = persistenceQuery.getResultList();
		em.getTransaction().commit();
		em.close();
		System.out.println(result);
		logger.info("newsearch");
	}
	

}
