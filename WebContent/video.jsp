<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos</title>
</head>
<body bgcolor="cyan">

<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");

if(session.getAttribute("Username")==null)
{
	response.sendRedirect("login.jsp");	
}
%>

<video width ="500" height="500" controls>
<source src= https://www.learningcontainer.com/wp-content/uploads/2020/05/sample-mp4-file.mp4?_=1  type="video/mp4"></video>

</body>
</html>