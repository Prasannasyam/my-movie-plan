package com.MyMoviePlan.exception;

public class MovieShowNotFoundException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MovieShowNotFoundException(String message) {
        super(message);
    }
}
