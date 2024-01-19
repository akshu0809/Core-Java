package com.edubridge.compileinput;
import java.util.Scanner;
public class BoolanDataType {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
	    boolean x= false;
	    int y=s.nextInt();
	    char z=s.next().charAt(3);
	    String a=s.nextLine();
	    System.out.println(x);
	    System.out.println(y);
        System.out.println(z);
        System.out.println(a);
	}

}
