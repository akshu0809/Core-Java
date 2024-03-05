package com.edubridge.generics;
//Program to demonstrate on generic 
class Citizen<T>
{
	//where T defines any kind of type-value
	T str;
	T str1;
	
	void print(T str,T str1)
	{
		this.str=str;
		this.str1=str1;
		
		System.out.println("The Value is: "+str+" "+str1);
	}
}
//drive class
public class GenericClassDemo {

	public static void main(String[] args) {
		Citizen<String>c=new Citizen<>();
		c.print("Nagpur","Indian");

	}

}
