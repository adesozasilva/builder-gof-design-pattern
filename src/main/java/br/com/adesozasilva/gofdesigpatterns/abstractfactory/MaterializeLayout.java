package br.com.adesozasilva.gofdesigpatterns.abstractfactory;

public class MaterializeLayout extends Layout {

	@Override
	public Button createButton() {
		return new MaterializeButton();
	}

}
