package com.edubridge.lambdaexpression;
//lambda Expression
public class ProductExcutor {

	public static void main(String[] args) {
		//Lambda Expression
		Product p=(price)->{
			System.out.println("Price is: "+price);
		};
		System.out.println(p.displayProductName());
		System.out.println(Product.ProductBran());
	    p.displayProductPrice(5000);
	    
	
	}

}
