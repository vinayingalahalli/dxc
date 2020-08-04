<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP</title>
</head>
<body>
<h1>Hello from HTML</h1>
<%="<h1>Hello from JSP</h1>" %>
<h2>Scripting elements demo</h2>
<%
int x=0;
out.print("x = "+(x++));
%>
<br/>
<%!int y = 0; %>
<%="y = "+(y++) %> <br/>
Y = <input type="text" value="<%=y %>">


</body>
</html>