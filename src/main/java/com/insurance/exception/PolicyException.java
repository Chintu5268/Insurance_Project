package com.insurance.exception;

public class PolicyException {

	private final  String message;

	public PolicyException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	
}
