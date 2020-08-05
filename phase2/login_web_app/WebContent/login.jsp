<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login JSP Demo</title>
</head>
<body>
	<div align="center">
		<h3>
			<u>Login Using JSP</u>
		</h3>
		<form action="login" method="post">
			<table border="1px">
				<tr>
					<td><input type="text" name="username" placeholder="Enter Username">
				</tr>
				<tr>
					<td><input type="password" name="password" placeholder="Enter Password">
				</tr>
				<tr>
					<td><input type="submit" value="Login">
				</tr>
			</table>
		</form>
		
		<%if(request.getAttribute("error")!=null){ %>
		<span style="color:red;"><%= request.getAttribute("error")%></span>
		<%
		request.removeAttribute("error");
		} %>
	</div>
</body>
</html>