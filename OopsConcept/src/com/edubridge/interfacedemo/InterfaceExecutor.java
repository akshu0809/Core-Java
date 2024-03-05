package com.edubridge.interfacedemo;
//Driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		//we can't create an object for an interface
		//Cafe c=new Cafe();
		TheVibe t=new TheVibe();
		t.showMenu();
		t.displayPrice();
		

	}

}
