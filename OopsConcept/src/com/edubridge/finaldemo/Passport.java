package com.edubridge.finaldemo;
//Child class
public class Passport extends Card {
	
	private final String passportno="IND66787899";
	private String dateOfexpiry;
	
	
	//getter and setter
	public String getDateOfexpiry() {
		return dateOfexpiry;
	}
	public void setDateOfexpiry(String dateOfexpiry) {
		this.dateOfexpiry = dateOfexpiry;
	}
	public String getPassportno() {
		return passportno;
	}
	
	
	
	@Override
	public String toString() {
		return "Passport [passportno=" + passportno + ", dateOfexpiry=" + dateOfexpiry + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
