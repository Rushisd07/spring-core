package com.core.external;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Payment p =  ctx.getBean("payment",Payment.class);
		Payment p1 =  ctx.getBean("payment1",Payment.class);
		
		
		int ch;
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Master Card");
		System.out.println("2. Visa Card");
		System.out.println("3. Exit");
		
		System.out.println("Enter Your Choice :");
		ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			p.payM("123", 100);
			break;
		
		case 2:
			p1.payV("234", 200);
			break;
		
		case 3:
			System.out.println("Transaction Cancel");
			break;
		}
		
				
	}

}
