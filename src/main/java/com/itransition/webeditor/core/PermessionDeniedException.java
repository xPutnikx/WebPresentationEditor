package com.itransition.webeditor.core;

public class PermessionDeniedException extends Exception {
	private static final long serialVersionUID = 8537540817982678070L;

	@Override
	public String getMessage() {
		return "You don't have enough permissions!";
	}
	
}
