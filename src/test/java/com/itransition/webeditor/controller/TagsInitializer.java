package com.itransition.webeditor.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.itransition.webeditor.model.Tags;

@Component
@Scope("prototype")
public class TagsInitializer {
	public static final int TAG_COUNT = 32;

	@PersistenceContext
	private EntityManager entityManager;

	public List<Long> tags = new ArrayList<Long>();

	public void initData() {
		tags.clear();
		addTag("Jim");
		addTag("Tina");
		addTag("Steve");
		entityManager.flush();
		entityManager.clear();
	}

	public void addTag(String name) {
		Tags t = new Tags();
		t.setName(name);
		entityManager.persist(t);
		tags.add(t.getId());
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
}
