package com.itransition.webeditor.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.itransition.webeditor.model.UserRoles;

@Repository
public class UserRolesDao {	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	@Cacheable("roles")
	public UserRoles findById(Long id) {
		return entityManager.find(UserRoles.class, id);
	}
	
	@Transactional	
	@CacheEvict(value = "roles", allEntries = true)
	public  UserRoles  findByUserId(Long userId) {		
		return (UserRoles) entityManager.createQuery(
			    "select u from UserRoles u where u.userId='" + userId + "'")
			    .getResultList().get(0);
	}
	
	@Transactional	
	@CacheEvict(value = "roles", allEntries = true)
	public String getRoleByUserId(Long userId) {
		return (String) entityManager.createQuery(
				"select u.authority from UserRoles u where u.userId='" + userId + "'")
				.getResultList().get(0);
	}
		
	@Transactional
	@CacheEvict(value = "roles", allEntries = true)
	public void save(UserRoles userRoles) {
		if (userRoles.getId() == null) {
			entityManager.persist(userRoles);
		} else {
			entityManager.merge(userRoles);
		}	
	}
	
	@Transactional
	@CacheEvict(value = "roles", allEntries = true)
	public void removeById(Long id) {
		UserRoles userRoles = entityManager.find(UserRoles.class, id);
		entityManager.remove(userRoles);
	}
	
	@Transactional
	@CacheEvict(value = "roles", allEntries = true)
	public void removeByUserId(Long userId) {
		entityManager.createQuery(
				"delete from UserRoles u where u.userId=" + userId)
				.executeUpdate();
	}
	
}
