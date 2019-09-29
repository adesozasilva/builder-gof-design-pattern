package br.com.adesozasilva.gofdesigpatterns.factorymethod;

public class MaterializeButton extends Button {

	@Override
	public String render() {
		return "<button class=\"waves-effect\"></button>";
	}


}
