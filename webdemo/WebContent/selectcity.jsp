<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<%
  String cityname = request.getParameter("city");
  Cookie c = new Cookie("city", cityname);
  c.setMaxAge(30 * 24 * 60 * 60);
  response.addCookie(c);
  response.sendRedirect("listmovies.jsp");
%>
</body>
</html>