package com.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDbConnection {

	private static Connection connection;
	
	private MySqlDbConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/dxc";
		String username="root";
		String password="root";
		return connection=DriverManager.getConnection(url, username, password);
	}
}
//Single Ton Java Class