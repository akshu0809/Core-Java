package com.edubridge.operators;
import java.util.Scanner;
public class BitwiseAndShiftingOperator {
//Program to demonstrate on bitwise operator and shifting operator
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a<<b);
		System.out.println(a>>b);

	}

}
