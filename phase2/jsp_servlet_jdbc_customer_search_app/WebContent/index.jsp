<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Search Page</title>
</head>
<body>
<h2>Welcome to Customer Search Screen</h2>
<form action="customers">
Choose Customer Search Criteria 
<select name="criteria">
<option value="1">By Id</option>
<option value="2">By Gender</option>
<option value="3">By City</option>
<option value="4">By Contact</option>
<option value="5">List All Customers</option>
</select><br/>
Enter Criteria Value <input type="text" name="value"/><br/>
**Note skip the criteria value if the choice is to LIST ALL CUSTOMERS<br/>
<input type="submit" value="SEARCH">
</form>

<%if(request.getAttribute("error")!=null){%>
	<span style="color:red"><%=request.getAttribute("error") %></span>
<%}%>
</body>
</html>