package com.itransition.webeditor.controller;

import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itransition.webeditor.core.ConfirmKey;
import com.itransition.webeditor.dao.PersonDao;
import com.itransition.webeditor.model.Person;

@Controller
public class ConfirmRegistrationController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private PersonDao personDao;
	
	@RequestMapping(method = RequestMethod.GET, value="confirm")
	public String confirmRegistration(Model model, 
			@RequestParam(value = "id", required = true) Long id,			
			@RequestParam(value = "key", required = true) String key) {
		model.addAttribute("controllerMessage",	"Confirm Registration");				
		Person person = personDao.find(id);
		boolean check = checkConfirmationKey(person, key);
		
		if (check) {
			person.setActive(true);
			personDao.save(person);
			model.addAttribute("confirmationMessage", "Success, baby!");
		} else {
			model.addAttribute("confirmationMessage", "Registration key is not valid!");
		}
		return "confirm";
	}
	
	private boolean checkConfirmationKey(Person person, String key) {
		String checkKey = null;
		try {
			checkKey = ConfirmKey.generate(person.getUserName(), person.getPassword());
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (key.equals(checkKey)) {
			return true;
		} else {
			return false;
		}
	}
}
