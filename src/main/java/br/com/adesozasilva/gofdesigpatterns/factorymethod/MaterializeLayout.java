package br.com.adesozasilva.gofdesigpatterns.factorymethod;

public class MaterializeLayout extends Layout {

	@Override
	public Button createButton() {
		return new MaterializeButton();
	}

}
