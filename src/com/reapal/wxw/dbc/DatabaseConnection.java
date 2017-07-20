package com.reapal.wxw.dbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private static final String DBDRIVER="com.mysql.jdbc.Driver";
	private static final String DBURL="jdbc:mysql://localhost:3306/text";
	private static final String USER="root";
	private static final String PASSWORD="aicmy1314";
	private Connection conn=null;
	public DatabaseConnection()throws Exception{
		Class.forName(DBDRIVER);
		conn=DriverManager.getConnection(DBURL, USER, PASSWORD);
		
		
		
	}
	public Connection getConnection(){
		
		return this.conn;
	}
	public void close()throws Exception{
		
		conn.close();
		
	}
}
