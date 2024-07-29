package dbIntegration;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseOperations extends DBIntegration {

	public static void insertTestData() throws SQLException {
		initialiseddatabase();

		
		//This query insert into name into the data base not showing into console
		//to see the result check  database 
		String insertQuery = "INSERT INTO testdatabase.rachana_society(name)VALUES ('')";

		PreparedStatement preparestatement1 = connection.prepareStatement(insertQuery);
		preparestatement1.executeUpdate();
		
//		String viewtable="SELECT * FROM rachana_society";
//		PreparedStatement preparestatement2 = connection.prepareStatement(viewtable);
//		preparestatement2.executeLargeUpdate();
		
	}
	
	public static void main(String[]args) throws SQLException {
		insertTestData();
		System.out.println("test");
	}
}
