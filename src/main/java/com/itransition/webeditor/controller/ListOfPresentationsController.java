package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListOfPresentationsController {
	private static final Logger logger = LoggerFactory
			.getLogger(ListOfPresentationsController.class);

	@RequestMapping(value = "listOfPresentations.html", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("list with presentations");
		model.addAttribute("controllerMessage",
				"Presentations what create all users");
		model.addAttribute("titleMessage","Presentations database");
		model.addAttribute("Presentations","<li class=\"span3\"><a href=\"/webeditor/editor.html?preview=true#/step-1\" class=\"thumbnail\"> <img src=\"http://placehold.it/260x180\" alt=\"\"></a></li>");
		return "listOfPresentations";
	}
}
