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
@WebServlet("/ForgotServlet")
public class ForgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	PreparedStatement stmt=null;
	ResultSet result=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String id=request.getParameter("email id");
		//String password=request.getParameter("Password");
		Connection con=Connection1.getConnection();
		HttpSession session=request.getSession(false);
		
		session.setAttribute("id", id);
		try 
		{
			stmt=con.prepareStatement("select * from registration where email_id=?");
			stmt.setString(1, id);
			//stmt.setString(2, password);
			result=stmt.executeQuery();
			if(result.next())
			{
				System.out.println("Link send to your mail..!!"); 
				
				request.getRequestDispatcher("reset.jsp").forward(request,response);
			}
			
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
