package com.insurance.util;
import java.sql.*;

public class DBConn {
	
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/InsuranceM";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Pkamthe@20";
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    
    public static void main(String[] args) {
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    	}catch(ClassNotFoundException e) {
    		System.out.println(e);
    	}
        try {

            // Establish a connection
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Execute a query
            String query = "SELECT * FROM policy";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Process the results
            while (resultSet.next()) {
                int policyId = resultSet.getInt("policyId");
                String policyName = resultSet.getString("policyName");
             

                // Do something with the retrieved data
                System.out.println("Policy ID: " + policyId);
                System.out.println("Policy Name: " + policyName);
                
                
                System.out.println("-----------------------------");
            }
        } catch (SQLException e) {
        	System.out.println(e);
        }
    }

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
}