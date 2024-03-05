package com.edubridge.abstractclass;

import java.util.Scanner;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		ISRO i= new ISRO();
		System.out.println(i.display());
		i.displayDetails();
		i.setAgencyName("ISRO");
		i.setBudget(5678900);
		System.out.println("Enter the input:");
		i.displayDetails(s.next(), s.nextLong());

	}

}
