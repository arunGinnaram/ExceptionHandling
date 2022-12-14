package com.arun.Exceptionhandler;

public class NoBookFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1386578898891911061L;
	
	public NoBookFoundException(String msg) {
		super(msg);
	}
 
}
