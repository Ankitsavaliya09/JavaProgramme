package com.kn.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CrudOperation {

	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Ankit@sql123";
	private static final String INSERT_EMP_DATA = "INSERT INTO EMP1 VALUES(?,?,?);";
	private static final String READ_EMP_DATA = "SELECT * FROM EMP1;";
	private static final String UPDATE_EMP_DATA = "UPDATE EMP1 SET SALARY = (SALARY+1000) WHERE ID = ?;";
	private static final String DELETE_EMP_DATA = "DELETE FROM EMP1 WHERE ID = ?;";

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			
			System.out.println("Choose appropriate option :");
			System.out.println("1. TO INSERT DATA.");
			System.out.println("2. TO READ DATA.");
			System.out.println("3. TO UPDATE DATA.");
			System.out.println("4. TO DELETE DATA.");
			int option = scan.nextInt();
			
			switch (option) {
			case 1: {
				insertEmpData(con,scan);
				break;
			}
			case 2: {
				readEmpData(con,scan);
				break;
			}
			case 3: {
				updateEmpData(con,scan);
				break;
			}
			case 4: {
				deleteEmpData(con,scan);
				break;
			}
			
			default:
				System.out.println("Invalid Option!");
			}
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void deleteEmpData(Connection con, Scanner scan) {
		System.out.println("Enter ID = ");
		int id = scan.nextInt();
		
		try {
			PreparedStatement pstmt =  con.prepareStatement(DELETE_EMP_DATA);
			pstmt.setInt(1, id);
			pstmt.execute();
			System.out.println("Data Deleted Succesfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void updateEmpData(Connection con, Scanner scan) {
		System.out.println("Enter ID = ");
		int id = scan.nextInt();
		
		try {
			PreparedStatement pstmt =  con.prepareStatement(UPDATE_EMP_DATA);
			pstmt.setInt(1, id);
			pstmt.execute();
			System.out.println("Data Updated Succefully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void readEmpData(Connection con, Scanner scan) {
		try {
			PreparedStatement pstmt =  con.prepareStatement(READ_EMP_DATA);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("ID = "+rs.getInt(1)+", Name = "+rs.getString(2)+", Salary = "+rs.getDouble(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void insertEmpData(Connection con, Scanner scan) {
		System.out.println("Enter ID = ");
		int id = scan.nextInt();
		System.out.println("Enter Name = ");
		String name = scan.next();
		System.out.println("Enter Salary = ");
		double salary = scan.nextDouble();
		
		try {
			PreparedStatement pstmt = con.prepareStatement(INSERT_EMP_DATA);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setDouble(3, salary);
			pstmt.execute();
			System.out.println("Data Inserted Succefully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
