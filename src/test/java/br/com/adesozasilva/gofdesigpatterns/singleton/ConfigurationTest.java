package br.com.adesozasilva.gofdesigpatterns.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConfigurationTest {

	@Test
	public void testGetInstance() {
		Configuration instance = Configuration.getInstance();
		assertEquals(instance, Configuration.getInstance());
		
	}

}
