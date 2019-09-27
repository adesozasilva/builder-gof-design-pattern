package br.com.adesozasilva.gofdesigpatterns.simplefactory;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import br.com.adesozasilva.gofdesigpatterns.simplefactory.ConnectionFactory;

public class ConnectionFactoryTest {

	@Test
	public void test() {
		Connection connection = new ConnectionFactory().getConnection();
		assertNotNull(connection);
	}

}
