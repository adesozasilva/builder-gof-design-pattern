package br.com.adesozasilva.gofdesigpatterns.factorymethod;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;

import org.junit.Test;

public class DatabaseConnectionFactoryTest {

	@Test
	public void test() {
		
		Connection mysqlConnection = new DatabaseConnectionFactory().getConnection("MYSQL");
		Connection oracleConnection = new DatabaseConnectionFactory().getConnection("ORACLE");
		
		assertNotNull(mysqlConnection);
		assertNotNull(oracleConnection);
		
	}

}
