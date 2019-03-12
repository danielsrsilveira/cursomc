package com.danielsilveira.cursomc.services;

public class ObjectNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjetctNotFoundException(String msg, throwable cause) {
		super(msg, cause);
	}
	
}
