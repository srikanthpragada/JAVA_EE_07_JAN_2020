package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateSalary3 {

	public static void main(String[] args) {

		try (Connection con = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr")) {
			
			PreparedStatement ps = con.prepareStatement
					("update employees set salary = ? where employee_id = ?");
			// Read input 
			Scanner s = new Scanner(System.in);
			System.out.println("Enter employee id : ");
			int empid = s.nextInt();
			
			System.out.println("Enter new salary  : ");
			int salary = s.nextInt(); 
			
			ps.setInt(1, salary);
			ps.setInt(2, empid);
			
			int count = ps.executeUpdate();
					
			if (count == 1)
				System.out.println("Updated Successfully!");
			else
				System.out.println("Employee Id Not Found!");

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
