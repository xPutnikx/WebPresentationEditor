package com.itransition.webeditor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.itransition.webeditor.model.Presentations;

@Repository
public class PresentationDao {
	
	
		@PersistenceContext
		private EntityManager entityManager;
		
		public Presentations find(Long id) {
			return entityManager.find(Presentations.class, id);
		}
		
		@SuppressWarnings("unchecked")
		public List<Presentations> getPresentations() {
			return entityManager.createQuery("select p from Presentations p").getResultList();
		}
		
		@Transactional
		public Presentations save(Presentations presentations) {
			if (presentations.getId() == null) {
				entityManager.persist(presentations);
				return presentations;
			} else {
				return entityManager.merge(presentations);
			}		
		}	
		
	}
