<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b><center>Welcome To Employee Page</center></b> Welcome To Employee :
	${employeename}


	<%
	String empname = (String) request.getAttribute("employeename");
	out.println("Response from Scriptlt :" + empname);
	%>
</body>
</html>