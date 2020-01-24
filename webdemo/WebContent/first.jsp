<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP</title>
</head>
<body>

<%
    // process 
    // response.sendRedirect("second.jsp");
    request.setAttribute("now", java.time.LocalDateTime.now());
%> 

<jsp:include page="second.jsp">
  <jsp:param value="1" name="id"/>
</jsp:include>

<h2>Back in First.jsp</h2>
</body>
</html>