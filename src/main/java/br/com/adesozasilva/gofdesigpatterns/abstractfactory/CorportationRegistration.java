package br.com.adesozasilva.gofdesigpatterns.abstractfactory;

import static br.com.adesozasilva.gofdesigpatterns.abstractfactory.CustomerStatus.SAVED;

public class CorportationRegistration extends CustomerRegistration {

	private Customer customer;

	public CorportationRegistration(Customer customer) {
		this.customer = customer;
	}

	@Override
	protected Customer registerCustomer() {
		customer.setStatus(SAVED);
		return customer;
	}

}
