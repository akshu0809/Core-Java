package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2-connection
		
		String url="jdbc:mysql://localhost:3306/Management";
		String username="root";
		String password="root";
		
		//step 3-call DriverManager
		
		Connection conn=DriverManager.getConnection(url,username,password);
		Statement stmt=conn.createStatement();
		System.out.println("Collect Data from Employee Table");
		
		System.out.println("Inserting data into table.");
		String sql1="insert into employee values(109,'Sam',25)";
		
		stmt.execute(sql1);
		
		String sql="select * from employee";
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			int empId = rs.getInt("id");
			String empName=rs.getString("name");
			int empAge= rs.getInt("age");
			
			System.out.println("Employee Id:"+empId+"\nEmployee Name:"+empName+"\nEmployee Age:"+empAge);
		}
				
		
		

	}

}
