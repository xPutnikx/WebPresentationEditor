package com.itransition.webeditor.core;

import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itransition.webeditor.model.Users;

public class ConfirmationKey {
	private static final Logger logger = LoggerFactory
			.getLogger(ConfirmationKey.class);
	
	public boolean checkConfirmationKey(Users users, String key) {
		String checkKey = null;
		try {
			checkKey = ConfirmKey.generate(users.getName(), users.getPassword());
		} catch (NoSuchAlgorithmException e) {
			logger.error("No such algorithm detected!");
		}
		if (key.equals(checkKey)) {
			return true;
		} else {
			return false;
		}
	}
	
}
