package br.com.adesozasilva.gofdesigpatterns.abstractfactory;

public class Customer {

	private static final int DOCUMENT_INDIVIDUAL_LENGTH = 11;
	private static final int DOCUMENT_CORPORATION_LENGTH = 14;
	private String documentNumber;
	private CustomerStatus status;

	public Customer(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public boolean isIndividual() {
		return (this.documentNumber.length() == DOCUMENT_INDIVIDUAL_LENGTH);
	}

	public boolean isCorporation() {
		return (this.documentNumber.length() == DOCUMENT_CORPORATION_LENGTH);
	}
	
	public void setStatus(CustomerStatus status) {
		this.status = status;
	}
	
	public CustomerStatus getStatus() {
		return status;
	}

}
