package com.edubridge.interfacedemo;
//program to demonstrate on Cloneable
//Built-in marker interface
/*if we are not implementing a cloneable interface and if we are invoking the clone method in the driver class we will get an */
public class Employee implements Cloneable{
	
	

	public int empId;
	public String empName;
	public long salary;
	public Employee(int empId, String empName, long salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	
	void display()
	{
		System.out.println("Emp ID: "+empId);
		System.out.println("Emp Name: "+empName);
		System.out.println("Emp Salary: "+salary);
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
}
