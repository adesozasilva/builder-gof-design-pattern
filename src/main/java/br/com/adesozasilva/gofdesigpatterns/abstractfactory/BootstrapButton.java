package br.com.adesozasilva.gofdesigpatterns.abstractfactory;

public class BootstrapButton extends Button {

	@Override
	public String render() {
		return "<button class=\"btn btn-primary\"></button>";
		
	}

}
