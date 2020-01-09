package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) {

		try (Connection con = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr")) {
			System.out.println("Connected Using Thin Driver");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
