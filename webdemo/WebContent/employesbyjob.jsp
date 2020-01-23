<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="javax.sql.rowset.CachedRowSet,oracle.jdbc.rowset.OracleCachedRowSet"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees By Job</title>
</head>
<body>
	<h2>Employees By Job</h2>
	<form>
		Job Id <input type="text" name="jobid" value="${param.jobid}" /> 
		<input type="submit" value="Employees" />
	</form>

	<%
		String jobid = request.getParameter("jobid");
		if (jobid == null)
			return; // Terminate JSP
	%>
	
	<p/>

	<table width="100%" cellpadding="5pt" border="1">
		<tr style="background-color: black; color: white">
			<th>Id</th>
			<th>Name</th>
			<th>Salary</th>
			<th>Department</th>
		</tr>

		<%
			// get jobs info from JOBS table 
			CachedRowSet crs = new OracleCachedRowSet();
			crs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
			crs.setUsername("hr");
			crs.setPassword("hr");
			crs.setCommand(
					"select employee_id, first_name || ' ' || last_name name, salary, department_id from employees where job_id = ?");
			crs.setString(1, jobid);
			crs.execute();

			while (crs.next()) {
				out.println("<tr><td>" + crs.getString("employee_id") + "</td><td>" + crs.getString("name")
						+ "</td><td>" + crs.getString("salary") + "</td><td>" + crs.getString("department_id")
						+ "</td></tr>");
			}
			crs.close();
		%>
	</table>

</body>
</html>