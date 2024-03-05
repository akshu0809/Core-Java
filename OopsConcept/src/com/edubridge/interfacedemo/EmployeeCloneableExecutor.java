package com.edubridge.interfacedemo;

import java.util.Scanner;

public class EmployeeCloneableExecutor {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner s=new Scanner(System.in);
		System.out.println("Entry the empName:");
		int empId=s.nextInt();
		System.out.println("Entry the empName:");
		String empName=s.next();
		System.out.println("Entry the salary:");
		long salary=s.nextLong();
	
        Employee e1=new Employee(empId,empName,salary);
        Employee e2= (Employee) e1.clone();
        e2.display();
        
	}

}
