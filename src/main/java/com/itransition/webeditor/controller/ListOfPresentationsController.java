package com.itransition.webeditor.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.itransition.webeditor.model.Person;

@Controller
public class ListOfPresentationsController {
	private static final Logger logger = LoggerFactory
			.getLogger(ListOfPresentationsController.class);

	@RequestMapping(value = "listOfPresentations.html", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		logger.info("list with presentations");
		mav.addObject("controllerMessage",
				"Presentations what create all users");
		mav.addObject("titleMessage","Presentations database");
		mav.addObject("Presentations","<li class=\"span3\"><a href=\"/webeditor/editor.html?preview=true#/step-1\" class=\"thumbnail\"> <img src=\"http://placehold.it/260x180\" alt=\"\"></a></li>");
		mav.setViewName("listOfPresentations");
		return mav;
	}
//	@RequestMapping(method=RequestMethod.GET,value="list")
//	public ModelAndView listPeople() {
//		logger.debug("Received request to list persons");
//		ModelAndView mav = new ModelAndView();
//		List<Person> people = personDao.getPeople();
//		logger.debug("Person Listing count = "+people.size());
//		mav.addObject("people",people);
//		mav.setViewName("list");
//		return mav;
//		
//	}
}
