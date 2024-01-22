package com.edubridge.assesment;

import java.util.Scanner;

public class CountDigitDemo {

	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		while(N!=0)
		{
			count++;
			N=N/10;
			
		}	
		System.out.println(count);
		
	}

}
