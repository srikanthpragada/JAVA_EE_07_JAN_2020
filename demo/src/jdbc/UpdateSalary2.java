package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateSalary2 {

	public static void main(String[] args) {

		try (Connection con = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr")) {
			
			Statement st = con.createStatement();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter employee id : ");
			int empid = s.nextInt();
			
			System.out.println("Enter new salary  : ");
			int salary = s.nextInt(); 
			
			int count = st.executeUpdate
					("Update employees set salary = " + salary + 
							" where employee_id = " + empid);
			if (count == 1)
				System.out.println("Updated Successfully!");
			else
				System.out.println("Employee Id Not Found!");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
