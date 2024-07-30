<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String message=(String)request.getAttribute("msg");
	%>

	<h2>Login</h2>
	<form action="loginUser" method="post">
	<%
		if(message!=null){ %>
		<h4 style="color: red"><%=message %></h4><br>
		<% }%>
		<label for="username">Username:</label>
		<input type="text" id="username" name="username"><br><br>
		<label for="password">Password</label>
		<input type="password" id="password" name="password"><br><br>
		<!-- <button type="submit">Login</button><br><br> -->
		<input type="submit" value="Login">
	</form>
</body>
</html>