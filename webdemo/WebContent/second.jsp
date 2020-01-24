<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second JSP</title>
</head>
<body>
<h1>Second JSP</h1>
<h2>${param.id}</h2>
<h3>${requestScope.now}</h3>
<%
   out.println(request.getAttribute("now"));
%>
</body>
</html>