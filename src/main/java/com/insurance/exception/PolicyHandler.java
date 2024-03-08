package com.insurance.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PolicyHandler {

	@ExceptionHandler(value= {PolicyNotFoundException.class})
	public ResponseEntity<Object> policyHandler(PolicyNotFoundException policyNotFoundException) {
		PolicyException policyException = new PolicyException(policyNotFoundException.getMessage());
		return new ResponseEntity<>(policyException,HttpStatus.NOT_FOUND);
	}
	
	
}
