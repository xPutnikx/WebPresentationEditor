package com.itransition.webeditor.controller;

import com.itransition.webeditor.model.Users;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class DataInitializer {

	public static final int PERSON_COUNT = 7;

	@PersistenceContext
	private EntityManager entityManager;

	public List<Long> people = new ArrayList<Long>();

	public void initData() {
		people.clear();// clear out the previous list of people
		addPerson("Jim", "xputnikx@mail","41223",true);
		addPerson("Tina", "xputnikx@mail","1111",true);
		addPerson("Steve", "xputnikx@mail","34342",true);
		entityManager.flush();
		entityManager.clear();
	}

	public void addPerson(String name, String email, String password,boolean enabled) {
		Users p = new Users();
		p.setName(name);
		p.setEmail(email);
		p.setPassword(password);
		p.setEnabled(enabled);
		entityManager.persist(p);
		people.add(p.getId());
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
}
