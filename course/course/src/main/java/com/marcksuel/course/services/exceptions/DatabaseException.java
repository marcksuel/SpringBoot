package com.marcksuel.course.services.exceptions;

public class DatabaseException extends RuntimeException

{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String e) {
		super(e);
	}

}
