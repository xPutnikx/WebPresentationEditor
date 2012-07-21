package com.itransition.webeditor.controller;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

public class ContactControllerTest {

	@Test
	public void testController() {
		ContactController controller = new ContactController();
		Model model = new ExtendedModelMap();
		Assert.assertEquals("contact",controller.home(model));
		
		Object messageController = model.asMap().get("controllerMessage");
		Object messageTitle = model.asMap().get("contactTitleMessage");
		Assert.assertEquals("Created by Putnik" +"/n"+
				"If you find bug, please send me email , xputnikx@gmail.com",messageController);
		Assert.assertEquals("Contacts",messageTitle);
	}
}
