package dbIntegration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBIntegration {
	public static Connection connection;

	public static Connection initialiseddatabase() throws SQLException {
		String username = "root";
		String password = "root";

		connection = DriverManager.getConnection("jdbc:mysql://127.0.01:3306/testdatabase", username, password);
		return connection;

	}

//	public static void main(String[] args) throws SQLException {
//
//		String username = "root";
//		String password = "root";
//
//		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.01:3306/testdatabase", username,
//				password);
//
//		if (connection.isClosed()) {
//			System.out.println("Not Connected to Database");
//		} else {
//			System.out.println("Connected to DataBase");
//		}
//
//		Statement smt = connection.createStatement();
//
//		ResultSet result = smt.executeQuery("Select * from testdatabase.city");
//		while (result.next()) {
//			String name = result.getString("name");
//			System.out.println(name);
//		}
//		result.close();
//	}
}
