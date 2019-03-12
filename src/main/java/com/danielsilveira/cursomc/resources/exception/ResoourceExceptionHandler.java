package com.danielsilveira.cursomc.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ResoourceExceptionHandler {
	
	public ResponseEntity<StandardError> objectNotFound(ObjetctNotFoundException e, HttpServletRequest request) {
		
		StandarError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessate(), System.currentTimeMillis());
		return ResponseEntity<T>.status(HttpStatus.NOT_FOUND).body(err);
	}
}
