package com.itransition.webeditor.core;

import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 *	Sends mail to confirm user registration.
 */
public class MailSender {
	private String email;
	private String message;
	private JavaMailSenderImpl javaMailSenderImpl;
	
	/**
	 * Creates new instance of MailSender.
	 * @param email
	 * @param message
	 */
	public MailSender(String email, String message) {
		initializeRecipientData(email, message);
		initializeMailSender();
	}
	
	private void initializeRecipientData(String email, String message) {
		this.email = email;
		this.message = message;
	}
	
	private void initializeMailSender() {
		javaMailSenderImpl = new JavaMailSenderImpl();
		Properties properties = new Properties();
		properties.setProperty("mail.smtp.from", "webeditor.confirmation@gmail.com");
		properties.setProperty("mail.smtp.user", "webeditor.confirmation@gmail.com");
        properties.setProperty("mail.smtp.password", "web12345web");
        properties.setProperty("mail.smtp.host", "smtp.gmail.com");
        properties.setProperty("mail.smtp.port", "587");
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.starttls.enable", "true");
        javaMailSenderImpl.setJavaMailProperties(properties);        
        javaMailSenderImpl.setUsername("webeditor.confirmation");
        javaMailSenderImpl.setPassword("web12345web");
	}
	
	/**
	 * Sends mail to confirm user registration. 
	 * @throws MessagingException  
	 */
	public void send() throws MessagingException {
		MimeMessage mimeMessage = javaMailSenderImpl.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
		mimeMessageHelper.setTo(email);
		mimeMessageHelper.setSubject("Confirm registration");
		mimeMessageHelper.setText(message);
		javaMailSenderImpl.send(mimeMessage);		
	}	
	
}
