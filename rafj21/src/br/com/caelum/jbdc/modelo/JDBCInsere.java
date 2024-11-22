package br.com.caelum.jbdc.modelo;


import java.sql.Connection;
import java.sql.SQLException;

import br.com.caelum.jbdc.ConnectionFactory;


public class JDBCInsere {

		public static void main(String[] args) throws SQLException {
			 Connection con = null;
			 
			 try {
				con = new ConnectionFactory().getConnection(); 
			 }catch(SQLException e) {
				 System.out.println(e);
			 }finally {
				 con.close();
			 }			
		}
}
