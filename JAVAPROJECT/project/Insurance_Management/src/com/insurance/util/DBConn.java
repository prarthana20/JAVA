package com.insurance.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	
	private static Connection connection;
	
	public static Connection getDBConn() {
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/InsuranceM", "root", "Pkamthe@20");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return connection;
	}
	
	
	public static void main(String[] args) {
		System.out.println(getDBConn());

	}

}
