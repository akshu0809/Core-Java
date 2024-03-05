package com.edubridge.constructor;
class Rectangle
{
	int length;
	int breadth;
	
	
	//parameterized
	Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	Rectangle(){
		System.out.println("Rectangle");
	}
	
	void displayAreaPerimeter() {
		System.out.println("Araea of Rectangle:"+length*breadth);
		System.out.println("Perameter of rectangle:"+2*(length+breadth));
		
	}
}
public class ConstructorExecutor {

	public static void main(String[] args) {
		Rectangle r1= new Rectangle(4,5);
		Rectangle r2= new Rectangle(5,8);
		Rectangle r3= new Rectangle();
		r1.displayAreaPerimeter();
		r2.displayAreaPerimeter();

	}

}
