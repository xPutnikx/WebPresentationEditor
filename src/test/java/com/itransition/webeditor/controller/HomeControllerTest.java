package com.itransition.webeditor.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import com.itransition.webeditor.dao.TagsDao;
import com.itransition.webeditor.model.Tags;
import com.itransition.webeditor.model.Users;

@ContextConfiguration("/test-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class HomeControllerTest {
	@Autowired
	private TagsInitializer tagsInitializer;
	
	@Autowired
	private TagsDao tagsDao;
	
	@Autowired
	private HomeController homeController;
	
<<<<<<< HEAD
	 @Before
	  public void setUp() {
		homeController = new HomeController();
		authenticationManager = EasyMock.createMock(AuthenticationManager.class);
	  }

=======
	@Before
	public void before() {
		tagsInitializer.initData();
	}
	
	
	@Test
	public void testController() {
//		ModelAndView mav = homeController.home();
//		@SuppressWarnings("unchecked")
//		List<Tags> tags = (List<Tags>) mav.getModelMap().get("tags");
//		assertNotNull(mav);
//		assertEquals("home", mav.getViewName());
//		assertNotNull(tags);		
//		assertEquals(TagsInitializer.TAG_COUNT,tags.size());	
//		Object message = mav.getModel().get("controllerMessage");
//		Assert.assertEquals("Home page",message);
	}
>>>>>>> 2b5512fbb7e8a47071e76100d94e4098df04307d
}
