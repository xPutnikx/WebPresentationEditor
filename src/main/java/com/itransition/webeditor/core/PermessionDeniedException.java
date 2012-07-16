package com.itransition.webeditor.core;

public class PermessionDeniedException extends Exception {

	@Override
	public String getMessage() {
		return "You don't have enough permissions!";
	}
	
}
