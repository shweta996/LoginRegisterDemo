package com.bridgelabz.project;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.jdbcconnection.Connection1;

@SuppressWarnings("unused")
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	PreparedStatement stmt=null;
	ResultSet result=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		
		String id=request.getParameter("email id");
		String password=request.getParameter("Password");
		HttpSession session=request.getSession(true);
		
		Connection con=Connection1.getConnection();
		try 
		{
			
			stmt=con.prepareStatement("select * from registration where email_id=? and password=?");
			stmt.setString(1, id);
			stmt.setString(2, password);
			result=stmt.executeQuery();
			

			if(result.next())
			{
				pw.write("logged in successfully ..!!");
			
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
			}
			session.invalidate();
			
		}
		catch (Exception e) 
		{
	   System.out.println(e);
			
		}	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
