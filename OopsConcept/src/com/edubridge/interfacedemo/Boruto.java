package com.edubridge.interfacedemo;

public class Boruto implements Naruto, Hinata {

	@Override
	public void powerone(int noofchildren, String position) {
		System.out.println(noofchildren+" "+position);
		
	}

	@Override
	public void power(int noofchildren, String position) {
		System.out.println(noofchildren+" "+position);
		
	}

	
}
