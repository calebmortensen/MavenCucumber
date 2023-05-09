package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "qafox";
		String dbURL = url+dbName;
		String username = "root";
		String password = "root";
		
		//Create an object for mysql jdbc driver class
		String driver = "com.mysql.cj.jdbc.Driver";    //"com.mysql.jdbc.Driver";
		Class.forName(driver).newInstance();
		
		//Connect to mysql database 
		Connection connection = DriverManager.getConnection(dbURL, username, password);
		if(!connection.isClosed()) {
			System.out.println("Successfully connected to MySQL qafox Database");
		}
		
		
		//Execute query to retrieve Employee table records
		/*
		 * Statement statement = connection.createStatement(); ResultSet resultSet =
		 * statement.executeQuery("Select * from employee");
		 * 
		 * while(resultSet.next()) {
		 * System.out.println(resultSet.getString("Name")+"--"+resultSet.getString(
		 * "Location")+"--"+resultSet.getInt("Experience")); }
		 */ 
		
		
		//Prepared Statement to Retrieve the Filtered Records from the Employee table
		PreparedStatement preparedStatement = connection.prepareStatement("Select * from Employee where Name=? and Experience=?");
		preparedStatement.setString(1, "Caleb");  //index from above for Name is 1
		preparedStatement.setInt(2, 10);           //index from above for Experience is 2
		ResultSet resultSet2 = preparedStatement.executeQuery();
		while(resultSet2.next()) {
			System.out.println(resultSet2.getString("Name")+"--"+resultSet2.getString("Location")+"--"+resultSet2.getInt("Experience"));
		}
		
		
		//Close Database connection
		connection.close();
		if(connection.isClosed()) {
			System.out.println("Successfully Closed the connection to the MYSql qafox Database");
		}
	}
	
			//netstat -aon   (Finds all ports in use)
	
}
