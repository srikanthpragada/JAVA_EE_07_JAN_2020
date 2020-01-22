<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Table</title>
</head>
<body>

<h1>Table</h1>

<table border="1" cellpadding="5px">
<tr>
<th>Number</th>
<th>Multiplier </th>
<th>Result</th>
</tr>
<%
  int num = Integer.parseInt(request.getParameter("num"));
  for(int i = 1; i <= 10; i ++)
  {
	 out.println("<tr><td style='text-align:right'>" + num + "</td><td style='text-align:right'>" + i  + "</td><td style='text-align:right'>" + num * i + "</td></tr>"); 
  }
%>

</table>

</body>
</html>