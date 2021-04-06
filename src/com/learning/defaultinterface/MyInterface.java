package com.learning.defaultinterface;

public interface MyInterface {
	
	public default void printMsg() {
		System.out.println("In default method of interface");
	}	
	private String getMSg(String msg) {
		return msg;
	}

}
