package com.itransition.webeditor.controller;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itransition.webeditor.service.UsersService;

@Controller
public class SearchController {
	private static final Logger logger = 
			LoggerFactory.getLogger(SearchController.class);
	
	@Autowired
	private UsersService usersService;
	
	@RequestMapping(value = "search", method = RequestMethod.GET)
	public String home(ModelMap model) {		
		model.addAttribute("controllerMessage", "hi");
		return "search";
	}
}
