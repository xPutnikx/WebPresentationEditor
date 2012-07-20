package com.itransition.webeditor.controller;

import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.mail.MessagingException;
import javax.persistence.PersistenceException;
import javax.validation.Valid;
import org.hibernate.exception.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.NestedServletException;
import com.itransition.webeditor.core.ConfirmKey;
import com.itransition.webeditor.core.MailSender;
import com.itransition.webeditor.dao.UsersDao;
import com.itransition.webeditor.form.Registration;
import com.itransition.webeditor.model.Users;
import com.itransition.webeditor.service.UsersService;

@Controller
@RequestMapping("/registrationform")
public class RegistrationController {
	@Autowired
	private RegistrationValidation registrationValidation;
	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	@Autowired
	private UsersDao usersDao;
	@Autowired
	private UsersService userService;

	public void setRegistrationValidation(
			RegistrationValidation registrationValidation) {
		this.registrationValidation = registrationValidation;
	}

	// Display the form on the get request
	@RequestMapping(method = RequestMethod.GET)
	public String showRegistration(Map model) {
		Registration registration = new Registration();
		model.put("registration", registration);
		return "registrationform";
	}

	// Process the form.
	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(@Valid Registration registration,
			BindingResult result, @ModelAttribute Users users, Errors errors)
			throws NestedServletException, PersistenceException,
			ConstraintViolationException {
		// set custom Validation by user
		registrationValidation.validate(registration, result);
		if (result.hasErrors()) {
			return "registrationform";
		}
		logger.debug("Received postback on person " + users);
		try {
			userService.save(users);
		} catch (PersistenceException nse) {
			errors.rejectValue("name",
					"lengthOfUser.registration.name",
					"This name already exists.");
			nse.printStackTrace();
			return "registrationform";
		}
		sendMailConfirmation(users);
		return "registrationsuccess";
	}

	private void sendMailConfirmation(Users users) {
		try {
			Long id = users.getId();
			String user = users.getName();
			String password = users.getPassword();
			String email = users.getEmail();
			String key = ConfirmKey.generate(user, password);
			String link = "http://localhost:8080/webeditor/social/confirm?id="
					+ +id + "&key=" + key;
			String message = "Hello " + user + "! " + link;
			MailSender mailSender = new MailSender(email, message);
			mailSender.send();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
