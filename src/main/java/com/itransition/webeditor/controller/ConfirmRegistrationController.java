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
import com.itransition.webeditor.dao.UsersDao;
import com.itransition.webeditor.model.Users;

@Controller
public class ConfirmRegistrationController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UsersDao usersDao;
	
	@RequestMapping(method = RequestMethod.GET, value="confirm")
	public String confirmRegistration(Model model, 
			@RequestParam(value = "id", required = true) Long id,			
			@RequestParam(value = "key", required = true) String key) {
		model.addAttribute("controllerMessage",	"Confirm Registration");				
		Users users = usersDao.find(id);
		boolean check = checkConfirmationKey(users, key);		
		if (check) {
			users.setEnabled(true);
			usersDao.save(users);
			model.addAttribute("confirmationMessage", "Success, baby!");
		} else {
			model.addAttribute("confirmationMessage", "Registration key is not valid!");
		}
		return "confirm";
	}
	
	private boolean checkConfirmationKey(Users users, String key) {
		String checkKey = null;
		try {
			checkKey = ConfirmKey.generate(users.getName(), users.getPassword());
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
