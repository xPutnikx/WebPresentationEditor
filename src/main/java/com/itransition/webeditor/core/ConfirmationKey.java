package com.itransition.webeditor.core;

import java.security.NoSuchAlgorithmException;

import com.itransition.webeditor.model.Users;

public class ConfirmationKey {

	public boolean checkConfirmationKey(Users users, String key) {
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
