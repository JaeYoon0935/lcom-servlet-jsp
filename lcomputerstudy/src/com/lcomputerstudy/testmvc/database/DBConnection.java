package com.lcomputerstudy.testmvc.database;

import java.sql.*;

public class DBConnection {

	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Connection conn = null;
		
		String url = "jdbc:mysql://localhost:3306/yyy";
		String id = "root";
		String pw = "1234";
		
		
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection(url, id, pw);
		
		return conn;
	}
}
