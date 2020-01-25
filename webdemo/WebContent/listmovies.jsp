<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Movies</title>
</head>
<body>
<h1>List of Movies</h1>

<%
  String city = null;
  for (Cookie c : request.getCookies())
  {
	  if (c.getName().equals("city"))
	  {
		   city  = c.getValue();
		   break;
	  }
  }	  
  if(city == null) // cookie not found
     response.sendRedirect("selectcity.html");
  else
	 out.println("<h2>Movies in city : " + city + "</h2>");
	  
%>

</body>
</html>