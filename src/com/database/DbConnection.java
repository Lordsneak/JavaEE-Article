package com.database;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbConnection {
	
	public static Connection Connection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:8000/MyFirstWebJee?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC",
					"root", "admin");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
}
