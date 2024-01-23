package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("practiceContext.xml");
		
		Practice pr = ctx.getBean("practice",Practice.class);
		
		pr.showData();
		
	}

}
