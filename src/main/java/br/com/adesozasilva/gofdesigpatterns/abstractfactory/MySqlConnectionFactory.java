package br.com.adesozasilva.gofdesigpatterns.abstractfactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnectionFactory implements AbstractFactory<Connection> {

	public Connection getConnection() {
		try {
			Connection connection = 
					DriverManager.getConnection("jdbc:mysql://locahost:3306/database", "root", "");
			
			return connection;
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		}
	}

}
