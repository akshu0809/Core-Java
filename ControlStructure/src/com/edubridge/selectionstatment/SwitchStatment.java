package com.edubridge.selectionstatment;
import java.util.Scanner;
public class SwitchStatment {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int map_no=s.nextInt();
		switch(map_no) 
		{
		case 1:
			System.out.println("Welcome to Erangle");
			break;
		case 2:
			System.out.println("Welcome to Miramar");
			break;
			
		case 3:
			System.out.println("Welcome to Sanhok");
			break;
		case 4:
			System.out.println("Welcome to Vikandi");
			break;
		default:
			System.out.println("Invalid Map No");
		}
	}

}
