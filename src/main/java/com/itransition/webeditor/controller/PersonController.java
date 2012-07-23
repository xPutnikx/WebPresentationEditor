package com.itransition.webeditor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.NestedServletException;
import com.itransition.webeditor.core.AuthenticationManager;
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
	public String listPeople(ModelMap modelMap) {
		AuthenticationManager authenticationManager = new AuthenticationManager();
		boolean authenticated = authenticationManager.isAuthenticated();
		modelMap.addAttribute("authenticated", authenticated);
		if (authenticated) {
			modelMap.addAttribute("userName",
					authenticationManager.getUserName());
		}
		logger.debug("Received request to list persons");
		List<Users> users = usersService.getUsers();
		logger.debug("Person Listing count = " + users.size());
		modelMap.addAttribute("people", users);
		modelMap.addAttribute("username", getCurrentUserName());
		return "list";
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
