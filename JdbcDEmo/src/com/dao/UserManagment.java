package com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserManagment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2-connection
		
		String url="jdbc:mysql://localhost:3306/pre";
		String username="root";
		String password="root";
		
		//step 3-call DriverManager
		
		Connection conn=DriverManager.getConnection(url,username,password);
		
		//step 4-inserting record using preparedstatements
		String sql="insert into user(uid,uname,location)values(?,?,?)";
		
		CallableStatement cs=(CallableStatement) conn.prepareCall(sql);
		
		cs.setInt(1,101);
		cs.setString(2, "Sam");
		cs.setString(3, "Pune");
		cs.execute();
		
		
		
		System.out.println("Data inserted successfully");
				
		
		

	}
	
}

