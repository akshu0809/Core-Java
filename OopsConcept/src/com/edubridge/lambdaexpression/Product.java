package com.edubridge.lambdaexpression;
@FunctionalInterface
public interface Product {
	
	//abstract class
	void displayProductPrice(int price);
	//default method 
	default String displayProductName()
	{
		return "Perfume";
		
	}
	
	//static method

	static String ProductBran()
	{
		return "Zara";
	}

}
