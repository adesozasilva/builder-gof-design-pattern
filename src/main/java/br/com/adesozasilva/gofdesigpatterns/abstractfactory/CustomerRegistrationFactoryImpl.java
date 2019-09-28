package br.com.adesozasilva.gofdesigpatterns.abstractfactory;

public class CustomerRegistrationFactoryImpl implements CustomerRegistrationFactory {

	@Override
	public CustomerRegistration makeCustomerRegistration(Customer customer) throws CustomerNonExistentException {
		if(customer.isIndividual()) {
			return new IndividualRegistration(customer);
		
		}else if(customer.isCorporation()) {
			return new CorportationRegistration(customer);
		}
		
		throw new CustomerNonExistentException();
	}


}
