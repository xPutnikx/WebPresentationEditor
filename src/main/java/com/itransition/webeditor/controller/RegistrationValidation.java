package com.itransition.webeditor.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import com.itransition.webeditor.form.Registration;

@Component("registrationValidator")
public class RegistrationValidation {
	public boolean supports(Class<?> classSupport) {
		return Registration.class.isAssignableFrom(classSupport);
	}

	public void validate(Object target, Errors errors) {
		Registration registration = (Registration) target;
		String name = registration.getName();
		if (!(registration.getPassword()).equals(registration
				.getConfirmPassword())) {
			errors.rejectValue("password",
					"matchingPassword.registration.password",
					"Passwords do not match.");
		}
	}
}
