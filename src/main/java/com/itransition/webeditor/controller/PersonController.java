package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.itransition.webeditor.dao.UsersDao;
import com.itransition.webeditor.model.Users;
import com.itransition.webeditor.service.UsersService;

import java.util.List;

@Controller
@RequestMapping("/")
public class PersonController {
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

	@Autowired
	private UsersDao usersDao;
	@Autowired
	private UsersService usersService;

	@RequestMapping(method = RequestMethod.GET, value = "edit")
	public ModelAndView editPerson(
			@RequestParam(value = "id", required = false) Long id) {
		logger.debug("Received request to edit person id : " + id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("edit");
		Users users = null;
		if (id == null) {
			users = new Users();
		} else {
			users = usersDao.findById(id);
		}
		mav.addObject("users", users);
		return mav;
	}

	@RequestMapping(method = RequestMethod.POST, value = "edit")
	public String savePerson(@ModelAttribute Users users) {
		logger.debug("Received postback on person " + users);
		usersDao.save(users);
		return "redirect:list";
	}

	@RequestMapping(method = RequestMethod.GET, value = "list")
	public ModelAndView listPeople() {
		logger.debug("Received request to list persons");		
		ModelAndView mav = new ModelAndView();
		List<Users> people = usersDao.getUsers();
		logger.debug("Person Listing count = " + people.size());
		mav.addObject("people", people);
		mav.setViewName("list");		
		return mav;
	}

}
