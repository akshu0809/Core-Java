package com.edubridge.string;

public class StringExample {

	public static void main(String[] args) {
		//By using string literal
        String str1="Edubridge";
        String str2="Edubridge";
        //by using new keyword
        String str3=new String("Edubridge");
        String str4=new String("Edubridge");
        @SuppressWarnings("unused")
		String str5=new String("edubridge");
      
        //compare
        //by==
        System.out.println(str1==str2);	
        
        System.out.println(str1==str4);	
        
        System.out.println(str3==str4);	
        //by equals
        System.out.println(str1.equals(str4));	
        System.out.println(str4.equals(str5));	
	}

}
