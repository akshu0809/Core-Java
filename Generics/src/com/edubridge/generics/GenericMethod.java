package com.edubridge.generics;

public class GenericMethod {
	
	public static <E>void accept(E[] arr)
	{
		for(E itr:arr)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] arr1= {55,4,67,89,70};
		String[] arr2= {"Rhea","Tammana","Kiara"};
		System.out.println("First array is: ");
		GenericMethod.accept(arr1);
		
		System.out.println("Second array is: ");
		GenericMethod.accept(arr2);

	}

}
