package com.edubridge.abstractclass;

public abstract class GovernmentAgency {
	
	private String agencyName;
	private long budget;
	
	
	
	//getter and setter
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	
	//abstract Method
	abstract void displayDetails();
	abstract void displayDetails(String agencyName,long budget);
	
	
	//Concrete Method
	String display()
	{
		return "Concrete Method";
	}
	
	
	
		
}
