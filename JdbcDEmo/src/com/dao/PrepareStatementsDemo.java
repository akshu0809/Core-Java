package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepareStatementsDemo {

			public static void main(String[] args) throws ClassNotFoundException, SQLException {
				// step 1-load data
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//step 2-connection
				
				String url="jdbc:mysql://localhost:3306/pre";
				String username="root";
				String password="root";
				
				//step 3-call DriverManager
				
				Connection conn=DriverManager.getConnection(url,username,password);
				
				//step 4-inserting record using preparedstatements
				String sql="insert into user(uid,uname,location)values(?,?,?)";
				
				PreparedStatement ps=conn.prepareStatement(sql);
				
				ps.setInt(1,102);
				ps.setString(2, "Akshay");
				ps.setString(3, "Mumabi");
				
				@SuppressWarnings("unused")
				int i=ps.executeUpdate();
				
				System.out.println("Data inserted successfully");
						
				
				

			}


	}


