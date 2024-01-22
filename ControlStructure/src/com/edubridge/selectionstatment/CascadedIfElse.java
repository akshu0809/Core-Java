package com.edubridge.selectionstatment;
import java.util.Scanner;
public class CascadedIfElse {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && b>c)
		{	
			System.out.println("a is heavier");
		}
		else if(b>a && b>c)
		{	
			System.out.println("b is heavier");
	    }
		else
			System.out.println("c is heavier");
	}
   
}
