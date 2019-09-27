package br.com.adesozasilva.gofdesigpatterns.factorymethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnectionFactory {

	public Connection getConnection() {
		try {
			Connection connection = 
					DriverManager.getConnection("jdbc:oracle://locahost:3306/database", "user", "123456");
			
			return connection;
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		}
	}

}
