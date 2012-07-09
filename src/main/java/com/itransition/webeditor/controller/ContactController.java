package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
	private static final Logger logger = LoggerFactory
			.getLogger(ContactController.class);
	@RequestMapping(value = "contact.html", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("My Contacts");
		model.addAttribute("controllerMessage",
				"Created by Putnik" +"/n"+
				"If you find bug, please send me email , xputnikx@gmail.com");
		model.addAttribute("contactTitleMessage", "Contacts");
		return "contact";
	}
}
