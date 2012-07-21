package com.itransition.webeditor.controller;

import junit.framework.Assert;

import org.apache.lucene.queryParser.ParseException;
import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

public class AboutControllerTest {

		@Test
		public void testController() {
			AboutController controller = new AboutController();
			Model model = new ExtendedModelMap();
			Assert.assertEquals("about",controller.home(model));
			
			Object message = model.asMap().get("controllerMessage");
			Assert.assertEquals("This cool web editor with black jack and whores",message);
		}
	}
