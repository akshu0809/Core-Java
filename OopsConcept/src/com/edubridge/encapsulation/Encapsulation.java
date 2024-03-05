package com.edubridge.encapsulation;
// program to demonstrate on encapsulation 
//drive class
public class Encapsulation {

	public static void main(String[] args) {
		
		Customer c= new Customer();
		c.setBranch("Nerul");
		c.setIfscCode("SBI120078");
		c.setCustname("Akshay");
		c.setCustId(1324);
		c.setPinno(5865);
		System.out.println(c.getBranch());
		System.out.println(c);
		

	}

}
