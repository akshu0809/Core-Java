package com.edubridge.classandobject;
class Vegetables
{
	//variables or fields
	String vegetableName;
	int price;
	
	//methods
	void print()
	{
		System.out.println("Vegetable name: "+vegetableName+" "+"price is:"+price);
	}
}

public class ClassAndObjectExecutor {

	public static void main(String[] args) {
		Vegetables v=new Vegetables();
		v.vegetableName="JackFruit";
		v.price=80;
		v.print();
		

	}

}
