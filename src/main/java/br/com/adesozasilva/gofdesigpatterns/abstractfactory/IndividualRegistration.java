package br.com.adesozasilva.gofdesigpatterns.abstractfactory;

import static br.com.adesozasilva.gofdesigpatterns.abstractfactory.CustomerStatus.SAVED;

public class IndividualRegistration extends CustomerRegistration {

	private Customer customer;

	public IndividualRegistration(Customer customer) {
		this.customer = customer;
	}

	@Override
	protected Customer registerCustomer() {
		customer.setStatus(SAVED);
		
		return customer;
		
	}

}
