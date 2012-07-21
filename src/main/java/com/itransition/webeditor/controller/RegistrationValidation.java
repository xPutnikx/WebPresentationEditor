package com.itransition.webeditor.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import com.itransition.webeditor.form.Registration;

@Component("registrationValidator")
public class RegistrationValidation {
	public boolean supports(Class<?> classSupport) {
		return Registration.class.isAssignableFrom(classSupport);
	}

	public void validate(Object target, Errors errors) {
		Registration registration = (Registration) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
				"NotEmpty.registration.name",
				"User Name must not be Empty.");
		String name = registration.getName();
		if ((name.length()) > 50) {
			errors.rejectValue("name",
					"lengthOfUser.registration.name",
					"User Name must not more than 50 characters.");
		}
		if (!(registration.getPassword()).equals(registration
				.getConfirmPassword())) {
			errors.rejectValue("password",
					"matchingPassword.registration.password",
					"Password and Confirm Password Not match.");
		}
	}
}
