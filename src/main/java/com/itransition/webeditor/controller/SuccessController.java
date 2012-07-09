package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class SuccessController {
	
		private static final Logger logger = LoggerFactory
				.getLogger(SuccessController.class);
		@RequestMapping(value = "success.html", method = RequestMethod.GET)
		public String home(Model model) {
			logger.info("success");
			model.addAttribute("controllerMessage",
					" This cool web editor with black jack and whores");
			return "success";
		}
	}
