package com.itransition.webeditor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.itransition.webeditor.model.Users;

@Repository
public class UsersDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public Users findById(Long id) {
		return entityManager.find(Users.class, id);		
	}
	
	@Transactional
	@SuppressWarnings("unchecked")
	@Cacheable("users")
	public List<Users> getUsers() {
		return entityManager.createQuery("select u from Users u").getResultList();
	}
	
	@Transactional
	@CacheEvict(value = "users", allEntries = true)
	public void save(Users users) {
		if (users.getId() == null) {
			entityManager.persist(users);
		} else {
			entityManager.merge(users);
		}		
	}
	
	@Transactional
	@CacheEvict(value = "users", allEntries = true)
	public void removeById(Long id) {
		Users users = entityManager.find(Users.class, id);
		entityManager.remove(users);
	}
	
	@Transactional
	@CacheEvict(value = "users", allEntries = true)
	public void setEnabledById(Long id, boolean enabled) {
		Users users = entityManager.find(Users.class, id);
		users.setEnabled(enabled);
		entityManager.merge(users);
	}
	@Transactional
	@Cacheable("users")
	public Users getUserByName(String name) {
		return (Users) entityManager.createQuery("select u from Users u where u.name='"+name+"'").getResultList().get(0);
	}
	@Transactional
	@Cacheable("users")
	public Users getUserById(Long id) {
		return (Users) entityManager.createQuery("select u from Users u where u.id='"+id+"'").getResultList().get(0);
	}
	
}
