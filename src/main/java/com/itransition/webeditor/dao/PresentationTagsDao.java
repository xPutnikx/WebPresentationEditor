package com.itransition.webeditor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.itransition.webeditor.model.PresentationTags;

@Repository
public class PresentationTagsDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public PresentationTagsDao findById(Long id) {
		return entityManager.find(PresentationTagsDao.class, id);
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<PresentationTags> findByPresentationId(Long presentationId) {
		return entityManager.createQuery("" +
				"select p from PresentationTags p where p.presentationId='" + 
				presentationId + "'").getResultList();
	}

	@Transactional
	public void save(PresentationTags presentationTags) {
		if (presentationTags.getId() == null) {
			entityManager.persist(presentationTags);			
		} else {
			entityManager.merge(presentationTags);
		}
	}
	
	@Transactional
	public void removeById(Long id) {
		PresentationTags presentationTags = entityManager.find(PresentationTags.class, id);
		entityManager.remove(presentationTags);
	}
	
	@Transactional
	public void removeByPresentationId(Long presentationId) {
		entityManager.createQuery(
				"delete p from PresentationTags p where p.presentationId='" + 
				presentationId + "'");
	}

}
