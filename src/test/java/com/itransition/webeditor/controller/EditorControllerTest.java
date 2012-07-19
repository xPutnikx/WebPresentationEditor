package com.itransition.webeditor.controller;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

public class EditorControllerTest {

	@Test
	public void testController() {
		EditorController controller = new EditorController();
		Model model = new ExtendedModelMap();
		Assert.assertEquals("editor",controller.home(model));
	}
}
