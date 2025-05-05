package com.techm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	//Method to create database connection
	static Connection connection;
	public static Connection createConnection() {
		try {
		if(connection==null) {
			//Loading jdbc driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create connection
			//Create Connection
			String username="system";
			String password="admin";
			String url="jdbc://localhost:3306/employeedb";
			connection=DriverManager.getConnection(url,username,password);
			return connection;
		}
		else {
			return connection;
		}
		}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
			return null;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
