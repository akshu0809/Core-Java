package com.edubridge.selectionstatment;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age and weight of a person");
		int age=s.nextInt();
		int weight=s.nextInt();
        if(age>=12)
        {
        	if((weight>=45 && weight<=110) || weight>=100)
            {
        		System.out.println("eligible for bunjee jumping. if  weight>=100 then extra roopes added. ");
            }
        	else
        	{
        		System.out.println("not eligible for bunjee jumping");
        	}
        }
        else
        {
        	System.out.println("Not eligible for bunjee jumping");
        }
	}

}
