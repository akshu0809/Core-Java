package com.edubridge.runtimearray;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//array declaration
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
	    {
			arr[i]=s.nextInt();
		}
		int max= arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if (max<arr[i])
			{
				max = arr[i];
	        }
		}
		System.out.println(max);
	 }
  }

