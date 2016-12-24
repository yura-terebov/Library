package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {

	private final String HOST = "jdbc:mysql://localhost:3306/library";
	private final String USERNAME = "root";
	private final String PASSWORD = "root";
	
	private Connection connection;
	
	public DBWorker() {
		try {
			connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
			System.out.println("The connection is established");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("The connection is not established");
		}
	}
	
	public Connection getConnection() {
		return connection;
	}
}
