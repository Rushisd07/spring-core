package com.practice;

public class Practice {
	private int id;
	private String name;
	private int mks_csc;
	private int mks_ph;
	
	public Practice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int Id() {
		return id;
	}
	public String Name(){	//String name
		return name;
	}
	public int Mks_csc() {
		return mks_csc;
	}
	public int Mks_ph() {
		return mks_ph;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMks_csc(int mks_csc) {
		this.mks_csc = mks_csc;
	}
	public void setMks_ph(int mks_ph) {
		this.mks_ph = mks_ph;
	}
	
	
	public void showData() {
		System.out.println("ID: "+Id());
		System.out.println("Name: "+Name());
		System.out.println("Mks of Python: "+Mks_csc());
		System.out.println("Mks of Java: "+Mks_ph());
		
	}
	
	
	
	
}
