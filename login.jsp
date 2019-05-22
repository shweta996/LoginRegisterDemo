<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>

<body>
<center>
Login<br><br>

<form action="LoginServlet">


	 Email Id: <input type="text" name="email id" required > <br> <br>
	 Password: <input type="password" name="Password" required>  <br> <br>
	 <input type="Submit">
	 <input type = "button" value = "clear"> <br> <br>
	 
	 <a href="registration.jsp">Register Here</a>  <br> <br>
	  <a href="forgot.jsp">Forgot Password</a> 

</form>

</center>
</body>
</html>