package com.itransition.webeditor.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itransition.webeditor.core.PermessionDeniedException;
import com.itransition.webeditor.model.Presentations;
import com.itransition.webeditor.service.PresentationsService;
import com.itransition.webeditor.service.UsersService;

@Controller
public class ListOfPresentationsController {
	private static final Logger logger = LoggerFactory
			.getLogger(ListOfPresentationsController.class);
	@Autowired
	private PresentationsService presentationService;

	@RequestMapping(value = "listOfPresentations", method = RequestMethod.GET)
	public ModelAndView listPresentations() {
		ModelAndView mav = new ModelAndView();
		logger.info("list with presentations");
		List<Presentations> presentation = presentationService.getPresentations();
		logger.debug("Presentation Listing count = "+presentation.size());
		mav.addObject("controllerMessage",
				"Presentations what create all users");
		mav.addObject("titleMessage","Presentations database");
		mav.addObject("presentation", presentation);
		mav.setViewName("listOfPresentations");
		return mav;
	}
	@RequestMapping(value ="preview.jsp", method = RequestMethod.GET)
	public ModelAndView home() {
		logger.info("preview");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("preview");
		return mav;
	}
}
