<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/SpringMVC/user/login" method="post">
		Account:<input type="text" name="account"></input><br /> Password:<input
			type="password" name="pwd"></input><br /> <input type="submit"
			value="Login"></input>
	</form>
	<a href="/SpringMVC/register.jsp">Register</a>
	<br /> ${msg}
</body>
</html>