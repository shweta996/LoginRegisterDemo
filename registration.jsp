<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>

<center>
Registration


<form action="RegistrationServlet" method="get">

	
	<table align="center">
		<tr>
		<th>First Name:</th>
		<th><input type="text"  name="firstname" required></th>
		</tr>
		    
		<tr>
		<th>Last Name:</th>
		<th><input type="text"  name="lastname" required></th>
		</tr>
		
		<tr>
		<th>Address:</th>
		<th><input type="text"  name="address" required></th>
		</tr>
		
		<tr>
		<th>Phone Number:</th>
		<th><input type="text"  name="phone number" pattern="[7-9][0-9]{9}" required></th>
		</tr>
		
		<tr>
		<th>Email Id:</th>
		<th><input type="text"  name="email id"required></th>
		</tr>
		
		<tr>
		<th>Password:</th>
		<th><input type="password"  name="password" required></th>
		</tr>
		
		<tr>
		<th>Retype Password:</th>
		<th><input type="password"  name="retype password" required></th>
		</tr>
		
		</table>
		</center>
	
	
<center>	

	 <button type="submit" value="register">Submit</button>
	 <button type="button">Clear</button>
	 </center>

</form>

</body>
</html>