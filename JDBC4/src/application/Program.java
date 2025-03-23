package application;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args) {
		//cria as váriaveis JDBC para poder ser usadas no finally
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		//faz um bloco de tratamento pq a conexão pode gerar uma exceção
		try {
			// instancia uma conexão com o banco de dados
			conn = DB.getConnection();
			//cria um objeto com um comando para ser executado no BD
			st = conn.createStatement();
			//instruções SQL para ser executada
			String SQL = "SELECT * FROM seller";
			rs = st.executeQuery(SQL);
			//enquanto houver informações na busca
			while(rs.next()) {
				//apresenta as informações no terminal
				String SQL2 = "INSERT INTO seller(Id, Name, Email, BirthDate, BaseSalary, DepartmentId) "
				+ "VALUES (" + rs.getInt("Id") + ", '" + rs.getString("Name") + "', '" + rs.getString("Email") 
				+ "', '" + rs.getDate("BirthDate") + " " + rs.getTime("BirthDate") + ", '" 
				+ rs.getInt("BaseSalary") + ", '" + rs.getInt("DepartmentId") + "');";
				
				System.out.println(SQL2);
			}
		}
		catch(SQLException e) {
			e.getStackTrace();
		}
		finally {
			//fecha as classe para não haver vazamento de memória
			DB.closeConnection();
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}

	}

}
