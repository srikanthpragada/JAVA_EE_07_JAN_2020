package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateSalary {

	public static void main(String[] args) {

		try (Connection con = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr")) {
			
			Statement st = con.createStatement();
			int count = st.executeUpdate
					("Update employee set salary = 10000 where employee_id = 110");
			if (count == 1)
				System.out.println("Updated Successfully!");
			else
				System.out.println("Employee Id Not Found!");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
