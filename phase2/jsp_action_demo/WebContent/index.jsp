<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Action Include Demo</title>
</head>
<body>

<form>
Enter Name <input type="text" name="fname"> <br/>
Choose Designation <select name="designation">
<option value="trainee">Trainee</option>
<option value="trainer">Trainer</option>
<option value="manager">Manager</option>
<option value="admin">Admin</option>
</select>
<br/>
<input type="submit" value="Login" name="click">
</form>

<%if(request.getParameter("click")!=null){
	String designation=request.getParameter("designation");
	if(designation.equalsIgnoreCase("trainee")){%>
		<jsp:include page="traineeHeading.jsp"></jsp:include>
	<% }else if(designation.equalsIgnoreCase("trainer")){%>
	<jsp:include page="trainerHeading.jsp"></jsp:include>
<% }
	else if(designation.equalsIgnoreCase("admin")){%>
	<jsp:include page="adminHeading.jsp"></jsp:include>
<% }else if(designation.equalsIgnoreCase("manager")){%>
<jsp:include page="managerHeading.jsp"></jsp:include>
<% }}
%>


Footer is included using directive include because it is common and no dynamic decision is required. It happens in translation phase
<%@include file="footer.html" %>
</body>
</html>