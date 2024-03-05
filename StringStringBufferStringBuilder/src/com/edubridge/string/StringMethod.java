package com.edubridge.string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		String str1="Nia Sharma";
		String str2=" ";
		System.out.println(str1.length());
		//To convert into char of array.
        char []arr=new char[10];
        str1.getChars(0, 10, arr, 0);
        System.out.println(Arrays.toString(arr));
        System.out.println(str1.compareTo("nia shaRma"));
        System.out.println(str1.compareTo("Nia Sharma"));
	    System.out.println(str1.compareToIgnoreCase("nia sharma"));
	    System.out.println(str2.isEmpty());
	    //System.out.println(str2.isBlank());
	    System.out.println(str1.charAt(4));
	    System.out.println("Hey Guy's, you are awesome".startsWith("He"));
	    System.out.println("Hey Guy's, you are awesome".endsWith("som"));
	    System.out.println(str1.toUpperCase());
	    System.out.println(str1.toLowerCase());
	    System.out.println(" The Karan Luthra ".trim());
	    

	}

}
