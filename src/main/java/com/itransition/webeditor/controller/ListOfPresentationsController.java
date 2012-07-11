package com.itransition.webeditor.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itransition.webeditor.dao.PresentationsDao;
import com.itransition.webeditor.model.Presentations;
import com.itransition.webeditor.model.Users;

@Controller
public class ListOfPresentationsController {
	private static final Logger logger = LoggerFactory
			.getLogger(ListOfPresentationsController.class);
	@Autowired
	private PresentationsDao presentationDao;
	
	@RequestMapping(value = "listOfPresentations.html", method = RequestMethod.GET)
	public ModelAndView listPresentations() {
		ModelAndView mav = new ModelAndView();
		logger.info("list with presentations");
		List<Presentations> presentation = presentationDao.getPresentations();
		logger.debug("Presentation Listing count = "+presentation.size());
		mav.addObject("controllerMessage",
				"Presentations what create all users");
		mav.addObject("titleMessage","Presentations database");
		mav.addObject("presentation", presentation);
		mav.setViewName("listOfPresentations");
		return mav;
	}
	@RequestMapping(value ="presentationView.html", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("preview");
		return "presentationView";
	}
}
