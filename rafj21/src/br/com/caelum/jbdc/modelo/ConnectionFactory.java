package br.com.caelum.jbdc.modelo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

		public Connection getConnection() {
			try {
				return DriverManager.getConnection(
						"jbdc:mysql://localhost/fj21","root","");
				
			}catch(SQLException e) {
				throw new RuntimeException(e);
			}
		}
}



