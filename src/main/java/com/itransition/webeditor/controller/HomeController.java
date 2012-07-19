package com.itransition.webeditor.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.security.core.userdetails.User;

import com.itransition.webeditor.dao.TagsDao;
import com.itransition.webeditor.model.Tags;
import com.itransition.webeditor.model.Users;

/**
 * Sample controller for going to the home page with a message
 */
@Controller
public class HomeController {
	@Autowired
	private TagsDao tagsDao;
	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		logger.info("Welcome home!");
		mav.addObject("controllerMessage",
				"Home page");
		mav.addObject("tagCloud",tagCloud());
		List<Tags> tags = tagsDao.getTags();
		logger.debug("Tag Listing count = " + tags.size());
		mav.addObject("tags", tags);
		mav.setViewName("home");
		return mav;
	}
	private String tagCloud(){
		return "<ul><li></li><li></li><li></li><li>" +
				"</li><li></li><li></li><li></li><li>+" +
				"</li><li></li><li></li><li></li>";
	}
}
