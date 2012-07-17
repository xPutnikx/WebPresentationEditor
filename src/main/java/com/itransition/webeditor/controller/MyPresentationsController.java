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
import org.springframework.web.servlet.ModelAndView;

import com.itransition.webeditor.model.Presentations;
import com.itransition.webeditor.service.PresentationsService;
import com.itransition.webeditor.service.UsersService;

@Controller
public class MyPresentationsController {
	private static final Logger logger = LoggerFactory
			.getLogger(ListOfPresentationsController.class);
	@Autowired
	private PresentationsService presentationService;
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value = "mypresentations", method = RequestMethod.GET)
	public ModelAndView myPresentations() {
		ModelAndView mav = new ModelAndView();
		logger.info("list with my presentations");
		List<Presentations> presentation = presentationService.getPresentations();
		logger.debug("Presentation Listing count = "+presentation.size());
		mav.addObject("controllerMessage",
				"Presentations what create all users");
		mav.addObject("titleMessage","Presentations database");
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername();
		Long userId=usersService.getUserByName(name).getId();
		mav.addObject("name",name);
		mav.addObject("id",userId);
		mav.addObject("presentation", presentation);
		mav.setViewName("mypresentations");
		return mav;
	}
}
