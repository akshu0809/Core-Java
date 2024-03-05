package com.edubridge.abstractclass;

public class ISRO extends GovernmentAgency {

	@Override
	void displayDetails() {
		System.out.println("Indian Space Research" + "Organsition ");
		
	}

	@Override
	void displayDetails(String agencyName, long budget) {
		System.out.println("agency Name and" + "budget is: "+agencyName+" "+budget);
		
	}
	
	

}
