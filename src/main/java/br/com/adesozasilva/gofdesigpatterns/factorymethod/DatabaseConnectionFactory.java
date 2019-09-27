package br.com.adesozasilva.gofdesigpatterns.factorymethod;

import java.sql.Connection;

public class DatabaseConnectionFactory {

	public Connection getConnection(String type) {
		if(type.equals("MYSQL")) {
			return new MySqlConnectionFactory().getConnection();
		}else if(type.equals("ORACLE")) {
			return new OracleConnectionFactory().getConnection();
		}
		
		return null;
	}

}
