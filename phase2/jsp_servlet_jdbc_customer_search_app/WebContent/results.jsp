<%@page import="java.util.List"%>
<%@page import="com.customer.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="st" uri="WEB-INF/customertags.tld"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Search Results</title>
</head>
<body>
<h2>Customer Results Page</h2>

<%List<Customer> customerList=(List<Customer>)session.getAttribute("customerList"); %>
<st:results customerList="<%=customerList %>"/>
</body>
</html>