package hu.bme.tmit.klima.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

	private Connection connection = null;

	private static DatabaseConnector instance = null;

	public static synchronized DatabaseConnector get() {
		if (instance == null) {

			try {
				instance = new DatabaseConnector();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

		}
		return instance;
	}

	public DatabaseConnector() throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.jdbc.Driver";

		String url = "jdbc:mysql://localhost/";
		String db = "klimadatabase";
		String user = "sqluser";
		String passwd = "sqluserpw";

		Class.forName(driver);

		connection = DriverManager.getConnection(url + db, user, passwd);
	}

	public Connection connection() {
		return connection;
	}

}