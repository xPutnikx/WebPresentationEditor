package com.itransition.webeditor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FacebookController {

	@RequestMapping(value = "facebook", method = RequestMethod.GET)
	public String fb(ModelMap modelMap) {
		modelMap.addAttribute("controllerMessage", "fb");
		return "facebook";
	}
}
