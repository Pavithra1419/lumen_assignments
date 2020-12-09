package com.training.assign;

public class RangeCheckException extends Exception {
     private String message;
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		
		return this.message ;
	}
	public RangeCheckException(String message) {
		super();
		this.message = message;
	}

}
