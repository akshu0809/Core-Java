package com.edubridge.runtimearray;

import java.util.Scanner;

/*program to demonstrate on multidimensional array*/
public class MultiDimensionalArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		//Two-D array decleration
		int arr[][]=new int[m][n];
		//storing the array elements
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("Array elements are: ");
		//To print array element
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
