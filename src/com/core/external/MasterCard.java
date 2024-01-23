package com.core.external;

public class MasterCard implements Card {

	@Override
	public boolean verifyMaster(String cardNo) {
		// TODO Auto-generated method stub
		
		System.out.println("Master card verification complete");
		return true;
	}

	@Override
	public boolean verifyVisa(String cardNo) {
		// TODO Auto-generated method stub
		return false;
	}

}
