<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Salary</title>
</head>
<body>
    <h2>Update Salary</h2>
	<form>
		Employee Id <br /> <input type="number" name="id"  value="${param.id}" />
		<p></p>
		New Salary <br /> <input type="number" name="salary" value="${param.salary}" />
		<p></p>
		<input type="submit" value="Update" />
	</form>
	
	<%
	  if ( request.getParameter("id") == null)
		  return; 
	%>
	
	<jsp:useBean class="beans.EmployeeBean" id="empbean" scope="page" />
	<jsp:setProperty property="*" name="empbean"/>
	
	<h3>
	<%
	  if (empbean.update())
		  out.println("Updated salary successfully!");
	  else
		  out.println("Sorry! Could not update salary!");
	%>
	</h3>
	
	
</body>
</html>