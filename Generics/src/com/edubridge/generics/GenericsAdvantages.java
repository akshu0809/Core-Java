package com.edubridge.generics;

import java.util.ArrayList;
import java.util.List;
public class GenericsAdvantages {

	public static void main(String[] args) {
		//1.type-safety
		List<String> obj=new ArrayList<>();
		//it ensures that to add only String Values
		//3. Compile-time checking
		//obj.add(11);
		obj.add("11");
		obj.add("Akshay");
		
		//2.with Generics, Type-casting is not required
		//List obj1=new ArrayList<>();
		List<String> obj1=new ArrayList<>();
		obj1.add("Akshay Shikare");
		//without generics,type-casting is required.
		String str1=obj1.get(0);
		

	}

}
