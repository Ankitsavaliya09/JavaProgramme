package com.kn.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionDemo {

	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Ankit@sql123";
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			System.out.println("----> Driver Not Found!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("--->Failed to Establish Connection");
			e.printStackTrace();
		}
	}

}
