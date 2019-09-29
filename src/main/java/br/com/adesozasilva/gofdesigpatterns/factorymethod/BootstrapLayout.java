package br.com.adesozasilva.gofdesigpatterns.factorymethod;

public class BootstrapLayout extends Layout {

	@Override
	public Button createButton() {
		return new BootstrapButton();
	}

}
