package com.itransition.webeditor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.itransition.webeditor.model.Users;

@Repository
public class UsersDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	public Users find(Long id) {
		return entityManager.find(Users.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Users> getUsers() {
		return entityManager.createQuery("select u from Users u").getResultList();
	}
	
	@Transactional
	public Users save(Users users) {
		if (users.getId() == null) {
			entityManager.persist(users);
			return users;
		} else {
			return entityManager.merge(users);
		}		
	}
	
}
