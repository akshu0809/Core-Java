package com.edubridge.inheritance.singleheritance;

//Child class
public class Learner extends Trainer {
	public String learnerName;
	public int rollno;
	
	public void display()
	{
		super.display();
		System.out.println(learnerName+" "+rollno);
	}

}
