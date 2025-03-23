package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		try{
			conn = DB.getConnection();
			
			String SQL = "SELECT * FROM department";
			
			st = conn.createStatement();
			
			rs = st.executeQuery(SQL);
			
			while(rs.next()) {
				System.out.println(rs.getInt("Id"));
			}
			
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		
		DB.closeConnection();

	}

}
