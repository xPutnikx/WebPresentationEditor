package com.itransition.webeditor.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.itransition.webeditor.model.UserRoles;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRolesDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public UserRoles find(Long id) {
		return entityManager.find(UserRoles.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<UserRoles> getPeople() {
		return entityManager.createQuery("select p from Person p").getResultList();
	}
	
	@Transactional
	public UserRoles save(UserRoles roles) {
		if (roles.getId() == null) {
			entityManager.persist(roles);
			return roles;
		} else {
			return entityManager.merge(roles);
		}		
	}	
	
}
