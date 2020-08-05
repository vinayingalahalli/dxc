<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<h3> Hello <%= session.getAttribute("username")%> </h3>
<h3>You have logged in successfully at <%=new Date(session.getCreationTime()) %></h3>
<a href='logout'>Logout</a>
</body>
</html>