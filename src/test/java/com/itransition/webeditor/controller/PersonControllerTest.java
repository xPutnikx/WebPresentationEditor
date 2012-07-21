package com.itransition.webeditor.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;
import com.itransition.webeditor.model.Users;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class PersonControllerTest {
	
	@Autowired
	private DataInitializer dataInitializer;
	
	@Autowired
	private PersonController personController;
		
	@Before
	public void before() {
		dataInitializer.initData();
	}
	
	@Test
	public void shouldReturnPersonListView() {
		ModelAndView mav = personController.listPeople();
		assertEquals("list",mav.getViewName());
		@SuppressWarnings("unchecked")
		List<Users> people = (List<Users>) mav.getModelMap().get("people");
		assertNotNull(people);		
		assertEquals(DataInitializer.PERSON_COUNT,people.size());
//		String username=(String) mav.getModelMap().get("username");
//		assertNull(username);
	}
	
	
	@Test
	public void shouldReturnNewPersonWithEditMav() {
		ModelAndView mav = personController.editPerson(null);
		assertNotNull(mav);
		assertEquals("edit", mav.getViewName());
		Object object = mav.getModel().get("users");
		assertTrue(Users.class.isAssignableFrom(object.getClass()));
		Users users = (Users) object;
		assertNull(users.getId());
		assertNull(users.getName());
//		String username=(String) mav.getModelMap().get("username");
//		assertNull(username);
	}
	
	@Test
	public void shouldReturnSecondPersonWithEditMav() {
		Long template = dataInitializer.people.get(1);
		ModelAndView mav = personController.editPerson(template);
		assertNotNull(mav);
		assertEquals("edit", mav.getViewName());
		Object object = mav.getModel().get("users");
		assertTrue(Users.class.isAssignableFrom(object.getClass()));
		Users users = (Users) object;
		assertEquals(template,users.getId());
//		String username=(String) mav.getModelMap().get("username");
//		assertNull(username);
	}
	
}
