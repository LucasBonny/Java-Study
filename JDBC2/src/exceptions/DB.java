package exceptions;

import java.sql.Connection;
import java.util.Properties;

public class DB {
	private static Connection conn = null;
	
	public static Properties loadProperties() {
		Properties prop = new Properties();
		return prop;
	}
	public static void closeConnection() {
		if(conn != null) {
			conn.close();
		}
	}
	public static Connection getConnection() {
		return conn; 
	}

}
