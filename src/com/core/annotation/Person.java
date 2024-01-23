package com.core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//stereotype is a package which contains all the annotations
//package include @Component, @Repository, @Controller, @Service

@Component("per1")
public class Person {
	@Value("10")
	private int per_id;
	@Value("Java")
	private String per_name;
	@Autowired		//automatically create a bean and inject into it
	
	//Overloaded constructor
	Address addr;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public int getPer_id() {
		return per_id;
	}


	public void setPer_id(int per_id) {
		this.per_id = per_id;
	}


	public String getPer_name() {
		return per_name;
	}


	public void setPer_name(String per_name) {
		this.per_name = per_name;
	}


	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "Person [per_id=" + per_id + ", per_name=" + per_name + ",\naddr=" + addr + "]";
	}	
}

//@Component("per1")
//Equivalent to 
//<bean id="per1" class="com.core.annotation.Person">

//@Value("10")
//int per_id
//same as 
//<property name="per_id" value="10"/>



