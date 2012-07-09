package com.itransition.webeditor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;


@Controller
@RequestMapping("/loginform.html")
public class LoginController {
	@RequestMapping(method = RequestMethod.GET)
	public String showForm(ModelMap model) {
		return "loginform";
	}
}