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
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.NestedServletException;

import com.itransition.webeditor.core.ConfirmKey;
import com.itransition.webeditor.core.MailSender;
import com.itransition.webeditor.dao.PersonDao;
import com.itransition.webeditor.form.Registration;
import com.itransition.webeditor.model.Person;

@Controller
@RequestMapping("/registrationform.html")
public class RegistrationController {
	@Autowired
	private RegistrationValidation registrationValidation;
	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	@Autowired
	private PersonDao personDao;
	
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
			BindingResult result, @ModelAttribute Person person,Errors errors) throws NestedServletException,PersistenceException,ConstraintViolationException {
		// set custom Validation by user
		registrationValidation.validate(registration, result);
		if (result.hasErrors()) {
			return "registrationform";
		}
		logger.debug("Received postback on person "+person);

		try{
		personDao.save(person);
		}
		catch (PersistenceException nse){
			errors.rejectValue("userName",
					"lengthOfUser.registration.userName",
					"This name already exists.");
			nse.printStackTrace();
			return "registrationform";
		}
		sendMailConfirmation(person);
		return "registrationsuccess";
		
	}
	
	private void sendMailConfirmation(Person person) {
		try {
			Long id = person.getId();
			String user = person.getUserName();
			String password = person.getPassword();
			String email = person.getEmail();
			String key = ConfirmKey.generate(user, password);
			String link = "http://localhost:8080/webeditor/spring/confirm?id="+
					+ id + "&key=" + key;
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

//Authenticator auth = new MailAuthenticator();
//Session session = Session.getInstance(properties, auth);
//Message msg = new MimeMessage(session);
//msg.setSubject(subject);
//msg.setSentDate(new Date());
//msg.setFrom(new InternetAddress(from, false));
//msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(rcpt, false));
//msg.setContent(msgContent, "text/html");
//Transport.send(msg);
//mail.from=s@t.com
//mail.host=smtp.gmail.com
//mail.user=user@gmail.com
//mail.pass=mygmailpassword
//mail.smtp.port=587
//mail.smtp.starttls.enable=true
//mail.smtp.auth=true