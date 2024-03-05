package com.edubridge.finaldemo;
//parent class 
public class Card {
	
	private String cardName;
	//private final string issuer;
	private final String issuer="GOI";
	
	//getter and setter
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getIssuer() {
		return issuer;
	}
	
	
	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", issuer=" + issuer + ", toString()=" + super.toString() + "]";
	}

	
	
}
