<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo 1</title>
</head>
<body>
<h3>Current Date is <%=new Date() %></h3>
<form action="">
Enter x <input type="text" name="x"><br/>
Enter y <input type="text" name="y"><br/>
<input type="submit" name="div" value="Divide">
</form>

<%if(request.getParameter("div")!=null){
	int x=Integer.parseInt(request.getParameter("x"));
	int y=Integer.parseInt(request.getParameter("y"));
	out.print("<h4>result is = "+(x/y));
}

%>
<%@include file="footer.html" %>
</body>
</html>