<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>

<style>
p{text-align: center;}</style>
</head>
<body bgcolor="silver">
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); //for preventing from using back after logout
if(session.getAttribute("Username")==null)
{
	response.sendRedirect("login.jsp");	
}
%>
	<p>
	Welcome ${Username}<br> 
	<a href="video.jsp">Videos Here</a>
	</p>
	<p><a href="aboutus.jsp">About Us</a></p>
	
	<form action="Logout"><br>
	<p><input type="submit" value="logout"></p>
	</form>
	
</body>
</html>