package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {
	@Value("10")
	private int std_id;
	@Value("Rushi")
	private String std_name;
	@Autowired 
	Student2 std;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public Student2 getStd() {
		return std;
	}
	public void setStd(Student2 std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "Student [std_id=" + std_id + ", std_name=" + std_name + ", std=" + std + "]";
	}	
}
