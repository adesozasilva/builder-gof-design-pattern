package br.com.adesozasilva.gofdesigpatterns.factorymethod;

public class BootstrapButton extends Button {

	@Override
	public String render() {
		return "<button class=\"btn btn-primary\"></button>";
		
	}

}
