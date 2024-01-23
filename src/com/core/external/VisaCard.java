package com.core.external;

public class VisaCard implements Card {

	@Override
	public boolean verifyVisa(String cardNo) {
		// TODO Auto-generated method stub
		
		System.out.println("Visa card verification successful");
		return true;
	}

	@Override
	public boolean verifyMaster(String cardNo) {
		// TODO Auto-generated method stub
		return false;
	}

}
