package com.core;

public class HelloWorld {

	private String message;
	
	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String sayHello(){	//String name
		
		//return "Hii "+name+" Welcome to Spring 5.x";
		//return "Hii Welcome to Spring 5.x";
		return message;
		
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
