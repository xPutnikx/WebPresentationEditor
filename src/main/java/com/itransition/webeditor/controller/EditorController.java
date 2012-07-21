package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("editor")
public class EditorController {
	private static final Logger logger = LoggerFactory
			.getLogger(EditorController.class);
	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("editor!");
		model.addAttribute("controllerMessage",
				"Edit");
		return "editor";
	}
}
