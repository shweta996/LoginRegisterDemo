<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>reset Password</h1>
<tr>
<form action="ResetpassServlet" method="post">
<table>
<tr><td>new Password :</td><td><input type="password" name="password"required>

</td></tr>
<tr><td>retype Password :</td><td><input type="password" name="retype password"required>
</td></tr>

<tr><td><input type="submit" name="submit" value="Reset"></td><td></td></tr>

</table>
</body>
</html>