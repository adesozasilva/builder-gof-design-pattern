package br.com.adesozasilva.gofdesigpatterns.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryProviderTest {

	@Test
	public void test() {
		AbstractFactory<?> oracleConnectionfactory = FactoryProvider.getFactory("ORACLE");
		AbstractFactory<?> mysqlConnectionfactory = FactoryProvider.getFactory("MYSQL");
		
		assertTrue(oracleConnectionfactory instanceof OracleConnectionFactory);
		assertTrue(mysqlConnectionfactory instanceof MySqlConnectionFactory);
		
	}

}
