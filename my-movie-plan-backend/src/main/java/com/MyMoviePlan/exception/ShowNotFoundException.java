package com.MyMoviePlan.exception;

public class ShowNotFoundException extends RuntimeException{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ShowNotFoundException(String message) {
        super(message);
    }
}
