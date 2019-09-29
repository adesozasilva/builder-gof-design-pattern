package br.com.adesozasilva.gofdesigpatterns.abstractfactory;

public class LayoutFactoryImpl {

	private LayoutType layoutType;

	public LayoutFactoryImpl(LayoutType layoutType) {
		this.layoutType = layoutType;
	}

	public Layout createLayout() throws LayoutNotFoundException {
		if(layoutType.equals(LayoutType.BOOTSTRAP)) {
			return new BootstrapLayout();
		}
		else if(layoutType.equals(LayoutType.MATERIALIZE)) {
			return new MaterializeLayout();
		}
		
		throw new LayoutNotFoundException();
	}
}
