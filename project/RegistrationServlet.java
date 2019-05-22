package com.bridgelabz.project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.jdbcconnection.Connection1;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	PreparedStatement stmt=null;
	ResultSet result=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		String address=request.getParameter("address");
		String phone=request.getParameter("phone number");
		String email=request.getParameter("email id");
		String password=request.getParameter("password");
		String repassword=request.getParameter("retype password");
		
		Connection con=Connection1.getConnection();
		try 
		{
			stmt=con.prepareStatement("insert into registration values (?,?,?,?,?,?,?)");
			stmt.setString(1, fname);
			stmt.setString(2,lname);
			stmt.setString(3,address);
			stmt.setString(4,phone);
			stmt.setString(5,email);
			stmt.setString(6, password);
			stmt.setString(7,repassword);
			//result=stmt.executeQuery();
	
if(password.equals(repassword))
{
	stmt.executeUpdate();
pw.println("<html><body align='center'><font color='orange'>Registered Successfully</font></body></html>");
request.getRequestDispatcher("login.jsp").include(request, response);
}
else 
{
	pw.println("<html><body align='center'><font color='red'>Password and Retype Password must be same</font></body</html>");
	request.getRequestDispatcher("registration.jsp").include(request, response);
}
				
}
catch (Exception e) 
{
	pw.println(e);
	pw.close();
			
}	

}
}
