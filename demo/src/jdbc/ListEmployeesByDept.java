package jdbc;

import java.util.Scanner;
import javax.sql.rowset.CachedRowSet;
import oracle.jdbc.rowset.OracleCachedRowSet;

public class ListEmployeesByDept {
	public static void main(String[] args) {
		try {
			// Read input
			Scanner s = new Scanner(System.in);
			System.out.println("Enter department id : ");
			int deptid = s.nextInt();

			CachedRowSet crs = new OracleCachedRowSet();
			crs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
			crs.setUsername("hr");
			crs.setPassword("hr");
			crs.setCommand("select first_name, salary from employees where department_id = ?");
			crs.setInt(1, deptid);
			crs.execute();
			while (crs.next()) {
				System.out.println(crs.getString(1) + ":" + crs.getInt(2));
			}
			crs.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
