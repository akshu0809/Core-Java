package com.edubridge.packone;
//program to demonstrate on public, private and default access specifier 
public class AccessSpecifier {
	//private variable
	private int Atm_pinNo;
	public String emailId;
	float percentage;
	
	//private method
	private void displayPinNo()
	{
		System.out.println(Atm_pinNo);
	}
    public void displayEmailID()
    {
    	System.out.println(emailId);
    }
     void displayPercentage()
    {
    	System.out.println(percentage);
    }
}
