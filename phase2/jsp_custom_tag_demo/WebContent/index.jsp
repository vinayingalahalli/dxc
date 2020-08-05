<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="st" uri="WEB-INF/mytags.tld" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom Tag Demo</title>
</head>
<body>
<h2>Simple tag Demo(Tag without attributes and body)</h2>
<st:mydate/>

<br/>
<br/>
<h2>Custom date Tag demo with 1 attribute</h2>
<%String x="dd-MMM-yy  hh:mm:ss a z"; %>
<st:customdate format="<%=x%>"/>

<br/>
<br/>
<h2>Tag with body demo </h2>
<st:upper>
I will be converted to uppercase
</st:upper>
</body>
</html>