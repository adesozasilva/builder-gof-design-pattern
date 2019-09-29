package br.com.adesozasilva.gofdesigpatterns.abstractfactory;

public class BootstrapLayout extends Layout {

	@Override
	public Button createButton() {
		return new BootstrapButton();
	}

}
