package com.itransition.webeditor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.itransition.webeditor.model.UserRoles;

@Repository
public class UserRolesDao {	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public UserRoles findById(Long id) {
		return entityManager.find(UserRoles.class, id);
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<UserRoles> findByUserId(Long userId) {
		return entityManager.createQuery(
				"select u from UserRoles u where u.userId='" + userId + "'").getResultList();
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	public List<String> getRolesByUserId(Long userId) {
		return entityManager.createQuery(
				"select u.authority from UserRoles u where u.userId='" + userId + "'").getResultList();
	}
		
	@Transactional
	public void save(UserRoles userRoles) {
		if (userRoles.getId() == null) {
			entityManager.persist(userRoles);
		} else {
			entityManager.merge(userRoles);
		}	
	}
	
	@Transactional
	public void removeById(Long id) {
		UserRoles userRoles = entityManager.find(UserRoles.class, id);
		entityManager.remove(userRoles);
	}
	
	@Transactional
	public void removeByUserId(Long userId) {
		entityManager.createQuery(
				"delete u from UserRoles u where u.userId='" + userId + "'");
	}
	
}
