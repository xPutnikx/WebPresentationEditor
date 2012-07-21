package com.itransition.webeditor.controller;

import org.apache.lucene.queryParser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AboutController{
	private static final Logger logger = LoggerFactory
			.getLogger(AboutController.class);
	@RequestMapping(value = "about", method = RequestMethod.GET)
	public String home(Model model){
		logger.info("About");
		model.addAttribute("controllerMessage",
				"This cool web editor with black jack and whores");
//		tagsDao.luceneSearch();
		return "about";
	}
}
