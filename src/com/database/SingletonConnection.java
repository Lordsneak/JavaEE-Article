package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	private static Connection connection;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:8000/MyFirstWebJee?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC","root","admin");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static Connection getConnection() {
		return connection;
	}
	
}
