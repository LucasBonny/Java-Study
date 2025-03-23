package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		
		//Parte 1
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement("INSERT INTO seller(Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?,?,?,?,?)");
			st.setString(1, "Lucas Bonny");
			st.setString(2, "lucas@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("13/05/2001").getTime()));
			st.setDouble(4, 1000.0);
			st.setInt(5, 4);
			
			int rowAffected = st.executeUpdate();
			
			System.out.println("Done: " + rowAffected + " Affected.");
		}
		catch (SQLException e){
			e.getStackTrace();
		}
		catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
		}

		//Parte 2
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement("INSERT INTO department(Name) VALUES (?)", Statement.RETURN_GENERATED_KEYS);
			st.setString(1, "Teste");
			
			int rows = st.executeUpdate();
			ResultSet rs = st.getGeneratedKeys();
			if(rows > 0) {
				while(rs.next()) {
					System.out.println("Row id: " + rs.getInt(1));
				}
			}
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
