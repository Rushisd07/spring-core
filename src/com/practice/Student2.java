package com.practice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student2 {
	@Value("90")
	private int mks_mm;
	@Value("95")
	private String mks_java;
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMks_mm() {
		return mks_mm;
	}
	public void setMks_mm(int mks_mm) {
		this.mks_mm = mks_mm;
	}
	public String getMks_java() {
		return mks_java;
	}
	public void setMks_java(String mks_java) {
		this.mks_java = mks_java;
	}
	@Override
	public String toString() {
		return "Student2 [mks_mm=" + mks_mm + ", mks_java=" + mks_java + "]";
	}	
}
