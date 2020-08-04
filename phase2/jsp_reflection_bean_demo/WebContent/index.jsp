<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<form action="" method="post">
Enter Name <input type="text" name="fname"><br/>
Enter age <input type="number" name="age"><br/>
Select Gender   <input type="radio" value="Female" name="gender">F &nbsp;&nbsp;&nbsp;&nbsp;
<input type="radio" value="Male" name="gender" >M <br/>
Select Country <select name="country">
<option value="INDIA">IND</option>
<option value="Other">OTH</option>
</select><br/>
Hobbies<br/>
<input type="checkbox" name="hobby" value="gaming">Gaming<br/>
<input type="checkbox" name="hobby" value="dance">Dance<br/>
<input type="checkbox" name="hobby" value="swimming">Swim<br/>
<input type="checkbox" name="hobby" value="social">Social N/wing<br/>
<input type="checkbox" name="hobby" value="other hobby">other<br/>
<br/>
Email <input type="email" name="email"><br/>
Contact <input type="number" name="contact"><br/>
<input type="submit" value="Register" name="Register">
</form>

<%if(request.getParameter("Register")!=null){%>

<!--  using request scope with forward-->
<%-- <jsp:useBean id="user" class="com.model.User" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<jsp:forward page="registerController"></jsp:forward> --%>

<!--  using session scope with sendRedirect-->
 <jsp:useBean id="user" class="com.model.User" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<%
response.sendRedirect("registerController");
}%>


</body>
</html>