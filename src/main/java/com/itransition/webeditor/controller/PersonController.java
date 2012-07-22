package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.NestedServletException;
import com.itransition.webeditor.core.PermessionDeniedException;
import com.itransition.webeditor.model.Users;
import com.itransition.webeditor.service.UsersService;

import java.util.List;

@Controller
@RequestMapping("/")
public class PersonController {
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

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
			users = usersService.findById(id);
		}
		mav.addObject("users", users);
		mav.addObject("username",getCurrentUserName());
		return mav;
	}

	@RequestMapping(method = RequestMethod.POST, value = "edit")
	public String savePerson(@RequestParam ("name") String name,@RequestParam ("email") String email,@RequestParam ("password") String password) throws NestedServletException {
		Users users=new Users();
		users.setEmail(email);
		users.setName(name);
		users.setPassword(password);
		users.setEnabled(true);
		logger.debug("Received postback on person " + users);
		usersService.save(users);
		usersService.registerById(users.getId());
		return "redirect:list";
	}

	@RequestMapping(method = RequestMethod.GET, value = "list")
	public ModelAndView listPeople() {
		logger.debug("Received request to list persons");		
		ModelAndView mav = new ModelAndView();
		List<Users> people = usersService.getUsers();
		logger.debug("Person Listing count = " + people.size());
		mav.addObject("people", people);
		mav.addObject("username", getCurrentUserName());
		mav.setViewName("list");		
		return mav;
	}
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public void changeActivity(@RequestParam ("json") long person,@RequestParam ("enable") boolean enable) throws PermessionDeniedException
	{
		if(enable){
			usersService.banById(person);
		}
		else{
			usersService.unbanById(person);
		}
	}
	@RequestMapping(value = "/listrole", method = RequestMethod.POST)
	public void changeRole(@RequestParam ("json") long person,@RequestParam ("role") String role)
	{
		
		if (role.equals("Admin")){
			usersService.makeAdministrator(person);
		}
		else{
			usersService.makeUser(person);
		}
		
	}
	@RequestMapping(value = "/listdelete", method = RequestMethod.POST)
	public void delUser(@RequestParam ("json") long person) throws PermessionDeniedException
	{
		usersService.removeById(person);
	}
	private String getCurrentUserName(){
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String name = user.getUsername();
		return name;
	}
}
