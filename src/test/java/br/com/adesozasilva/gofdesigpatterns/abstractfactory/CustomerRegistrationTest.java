package br.com.adesozasilva.gofdesigpatterns.abstractfactory;

import static br.com.adesozasilva.gofdesigpatterns.abstractfactory.CustomerStatus.SAVED;
import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerRegistrationTest {

	@Test
	public void test() {

		Customer individual = new Customer("52390217087");
		Customer corporation = new Customer("67597788000136");

		new CustomerRegistrationFactoryImpl()
				.makeCustomerRegistration(individual).registerCustomer();
		
		new CustomerRegistrationFactoryImpl()
				.makeCustomerRegistration(corporation).registerCustomer();
		
		assertTrue(individual.isIndividual());
		assertTrue(corporation.isCorporation());
		
		assertEquals(individual.getStatus(), SAVED);
		assertEquals(corporation.getStatus(), SAVED);
		
		
	}



}
