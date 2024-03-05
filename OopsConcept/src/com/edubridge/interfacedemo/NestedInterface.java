package com.edubridge.interfacedemo;

public class NestedInterface implements Books,Books.StoryBooks{

	public static void main(String[] args) {
		NestedInterface n=new  NestedInterface();
		n.showBooks();
		n.showStoryBooks();
		

	}

	@Override
	public void showStoryBooks() {
		System.out.println("Half-Girlfriend");
		
	}

	@Override
	public void showBooks() {
		System.out.println("Java Programming-"+"By Yashwant Kanetkar");
		
	}

}
