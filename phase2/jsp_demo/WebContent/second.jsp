<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second JSP</title>
</head>
<body>
<form action="">
Enter Name <input type="text" name="fname">
<input type="submit" value="Click ME" name="click">
</form>
<%
if(request.getParameter("click")!=null){
	out.print("<h2>Helllooooo "+request.getParameter("fname") +"</h2>");
	out.print("<h3>Date is "+new Date()+"</h3>");
}

%>
</body>
</html>