package com.bridgelabz.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connection1 {

	static Connection con=null;
	
	public static Connection getConnection()
	{    
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginRegister", "root", "new-password");
	System.out.println("connection done...!!");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
		}
		return con;
			
	}
}
