package com.core.external;

//This is a application class
//Modification is easy due to this class
//We do not have to change all cards classes
//Simply make changes in this class it will be affects on other cards class

public class Payment {

	private Card card;	//reference to the interface
	
	//cons setter getter 

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}
	
	
	//New method pay
	public void payM(String cardNo, int amt) {
		if(card.verifyMaster(cardNo)) 
			System.out.println("Master Payment Successful "+amt);
		
	}
	public void payV(String cardNo, int amt) {
		if(card.verifyVisa(cardNo)) 
			System.out.println("Visa Payment Successful "+amt);
	}
	
	
}
