package com.edubridge.operators;
import java.util.Scanner;
@SuppressWarnings("unused")
public class IncrementAndDecrement {
	//Program to demonstrate on Increment and Decrement
	public static void main(String[] args) {
		int a=6, b=3;
		@SuppressWarnings("unused")
		int res=a++ - ++b;
		@SuppressWarnings("unused")
		int res2= --a + b--;
		System.out.println(a);
		System.out.println(b);
	}

}
