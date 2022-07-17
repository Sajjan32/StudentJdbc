package com.techbook.util;
import java.sql.*;

public class DbConnectionUtil {

	
	private static final String URL = "jdbc:mysql://localhost:3306/student_db";
	private static final String DRIVER_NAME ="com.mysql.cj.jdbc.Driver";
	private static final String USER_NAME= "root";
	private static final String PASSWORD = "23Rahulbhai#@!";


public static Connection getConnection() throws SQLException, ClassNotFoundException  {
	Class.forName(DRIVER_NAME);
	return DriverManager.getConnection(URL,USER_NAME,PASSWORD);
}
}
