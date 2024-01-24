package com.edubridge.runtimearray;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		@SuppressWarnings("unused")
		/*Array declartion for jagged
		 * arry for an outside array
		 */
		int arr[][]=new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[2];
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr[i].length;j++)
        	{
        		arr[i][j]=s.nextInt();
        	}
        }
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=0;j<arr[i].length;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
        
	}

}
