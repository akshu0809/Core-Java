package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Posts {

	public static void main(String[] args) throws ClassNotFoundException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step 2-connection
		
		String url="jdbc:mysql://localhost:3306/Post";
		String username="root";
		String password="root";
		
		//step 3-call DriverManager
		
		Connection conn=DriverManager.getConnection(url,username,password);
		Statement stmt=conn.createStatement();
		System.out.println("Collect Data from Employee Table");
		
		String sql="select * from posts";
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			int Id = rs.getInt("pid");
			String Name=rs.getString("pname");
			String comments= rs.getString("comments");
			
			System.out.println("Post Id:"+Id+"\nPost Name:"+Name+"\nPost Comments:"+comments);
		}

	}

}
