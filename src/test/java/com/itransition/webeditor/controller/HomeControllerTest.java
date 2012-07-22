package com.itransition.webeditor.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import junit.framework.Assert;

import org.easymock.EasyMock;
import org.hibernate.jdbc.Expectation;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.builders.JUnit4Builder;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import com.itransition.webeditor.core.AuthenticationManager;
import com.itransition.webeditor.dao.TagsDao;
import com.itransition.webeditor.model.Tags;
import com.itransition.webeditor.model.Users;

@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class HomeControllerTest {
	
	@Autowired
	private HomeController homeController;
	private AuthenticationManager authenticationManager;
	
	 @Before
	  public void setUp() {
		homeController = new HomeController();
		authenticationManager = EasyMock.createMock(AuthenticationManager.class);
	  }
	
	@Test
	public void testController() {
		ModelAndView mav = 	homeController.getHomePage();
		assertNotNull(mav);
		assertEquals("home", mav.getViewName());
		EasyMock.expect(authenticationManager.getUserName()). andReturn("admin");
		EasyMock.expect(authenticationManager.getUserRole()). andReturn("ROLE_ADMIN");
		EasyMock.expect(authenticationManager.isAuthenticated()). andReturn(true);
		EasyMock.replay(authenticationManager);
		assertEquals("home",homeController.getHomePage());
		assertNotNull(mav.getModelMap().get("authenticated"));
		EasyMock.verify(authenticationManager);
	}
}
