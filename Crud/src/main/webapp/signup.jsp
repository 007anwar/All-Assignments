<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>SIGN UP HERE</h2>
<form action="signup">
ID:<input type="number" name="id"><br/>
NAME:<input type="text" name="name"><br/>
EMAIL:<input type="text" name="email"><br/>
PASSWORD:<input type="text" name="password"><br/>
<input type="submit" value="signup"><a href="login">Login</a>
</form>
<h1>${msg}</h1>
</body>
</html>