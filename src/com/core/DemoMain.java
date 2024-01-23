package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Start the container loads the applicationContext.xml file
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean from the container 
		HelloWorld h = ctx.getBean("hello",HelloWorld.class);	//bean id , classname.class
		
		//invoke the methods
//		System.out.println(h.sayHello("Rushi"));
		System.out.println(h.sayHello());
		
		
	}

}
