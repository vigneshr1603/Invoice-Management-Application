package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	public DatabaseConnection(){
		
	}
	
	//Change username and password here, tables will be created automatically
	private static final String jdbcURL = "jdbc:mysql://localhost:3306/invoice?useSSL=false&createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true";
	private static final String jdbcUsername = "root";
	private static final String jdbcPassword = "";

	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
	}
}
