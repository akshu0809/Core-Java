package com.edubridge.loppingstatements;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int i=1;
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		while(i<=N)
		{
			System.out.print(i+ " ");
			i++;
		}
	  
	}

}
