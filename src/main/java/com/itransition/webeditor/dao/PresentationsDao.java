package com.itransition.webeditor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.itransition.webeditor.model.Presentations;

@Repository
public class PresentationsDao {	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	@Cacheable("presentations")
	public Presentations findById(Long id) {
		return entityManager.find(Presentations.class, id);
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	@Cacheable("presentations")
	public List<Presentations> findByUserId(Long userId) {
		return entityManager.createQuery("" +
				"select p from Presentations p where p.userId='" + userId + "'").getResultList();
	}

	@Transactional
	@SuppressWarnings("unchecked")
	@Cacheable("presentations")
	public List<Presentations> getPresentations() {
		return entityManager.createQuery(
				"select p from Presentations p").getResultList();
	}

	@Transactional
	@CacheEvict(value = "presentations", allEntries = true)
	public void save(Presentations presentations) {
		if (presentations.getId() == null) {
			entityManager.persist(presentations);			
		} else {
			entityManager.merge(presentations);
		}
	}
	
	@Transactional
	@CacheEvict(value = "presentations", allEntries = true)
	public void removeById(Long id) {
		Presentations presentations = entityManager.find(Presentations.class, id);
		entityManager.remove(presentations);
	}
	
	@Transactional
	@CacheEvict(value = "presentations", allEntries = true)
	public void removeByUserId(Long userId) {
		entityManager.createQuery(
				"delete p from Presentations p where p.userId='" + userId + "'");
	}

}
