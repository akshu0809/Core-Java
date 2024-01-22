package com.edubridge.selectionstatment;

import java.util.Scanner;

public class IfElseStatment {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		if(a!=b)
			System.out.println("a not equal to b");
		else
			System.out.println("a is eual to b");
	}

}
