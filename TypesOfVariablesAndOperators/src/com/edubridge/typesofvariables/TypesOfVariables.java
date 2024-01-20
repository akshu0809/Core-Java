package com.edubridge.typesofvariables;

public class TypesOfVariables {
	//instance variable
	float salary=68546.52f;
	//static variable
    static int x=10;
    
    String display()
    {
    	//local variable
    	@SuppressWarnings("unused")
		char res='Z';
    	System.out.println(res);
    	return "Local Variable";
    }
    
	public static void main(String[] args) {
		System.out.println(x);
		TypesOfVariables obj=new TypesOfVariables();
		System.out.println(obj.display());
		System.out.println(obj.salary);
		

	}

}
