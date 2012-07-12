package com.itransition.webeditor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.itransition.webeditor.model.Presentations;

@Repository
public class PresentationsDao {	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public Presentations findById(Long id) {
		return entityManager.find(Presentations.class, id);
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<Presentations> findByUserId(Long userId) {
		return entityManager.createQuery("" +
				"select p from Presentations p where p.userId='" + userId + "'").getResultList();
	}

	@Transactional
	@SuppressWarnings("unchecked")
	public List<Presentations> getPresentations() {
		return entityManager.createQuery(
				"select p from Presentations p").getResultList();
	}

	@Transactional
	public void save(Presentations presentations) {
		if (presentations.getId() == null) {
			entityManager.persist(presentations);			
		} else {
			entityManager.merge(presentations);
		}
	}
	
	@Transactional
	public void removeById(Long id) {
		Presentations presentations = entityManager.find(Presentations.class, id);
		entityManager.remove(presentations);
	}
	
	@Transactional
	public void removeByUserId(Long userId) {
		entityManager.createQuery(
				"delete p from Presentations p where p.userId='" + userId + "'");
	}

}
