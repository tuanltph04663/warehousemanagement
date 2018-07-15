package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	private static final String HOST_NAME = "localhost";
	private static final String INSTANCE = "DESKTOP-BTVA5SK";
	private static final String DATABASE = "project1";
	private static final String USER = "sa";
	private static final String PASSWORD = "1111";

	public static Connection getSQLServerConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		// jdbc:sqlserver://localhost:1433/DESKTOP-BTVA5SK;databaseName=project1
		String connectionURL = "jdbc:sqlserver://" + HOST_NAME + ":1433" + ";instance=" + INSTANCE + ";databaseName="
				+ DATABASE;

		Connection conn = DriverManager.getConnection(connectionURL, USER, PASSWORD);
		return conn;
	}

}
