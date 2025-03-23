package application;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement("UPDATE seller SET BaseSalary = BaseSalary + ? "
					+ "WHERE (DepartmentId = ?)");
			st.setDouble(1, 200.0);
			st.setInt(2, 4);
			
			int rowsAff = st.executeUpdate();
			
			System.err.println("Done! Rows Affected: " + rowsAff);
			
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		finally {
			DB.closeConnection();
			DB.closeStatement(st);
		}

	}

}
