<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="javax.sql.rowset.CachedRowSet,oracle.jdbc.rowset.OracleCachedRowSet"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Jobs</title>
</head>
<body>
	<h1>Jobs</h1>

	<table width="100%" cellpadding="5pt" border="1">
		<tr style="background-color: black; color: white">
			<th>Id</th>
			<th>Title</th>
			<th>Min Salary</th>
			<th>Max Salary</th>
		</tr>

		<%
			// get jobs info from JOBS table 
			CachedRowSet crs = new OracleCachedRowSet();
			crs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
			crs.setUsername("hr");
			crs.setPassword("hr");
			crs.setCommand("select * from jobs");
			crs.execute();

			while (crs.next()) {
				out.println("<tr><td>" + crs.getString("job_id") + "</td><td>" + crs.getString("job_title")
						+ "</td><td>" + crs.getString("min_salary") + "</td><td>" + crs.getString("max_salary")
						+ "</td></tr>");
			}
			crs.close();
		%>
	</table>
</body>
</html>