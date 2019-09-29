package br.com.adesozasilva.gofdesigpatterns.factorymethod;

public abstract class Layout {

	public String createBody() {
		return "<html><head></head>"+
				"<body>" +
				createButton().render() +
				"</body>"+
				"</html>";
	}

	public abstract Button createButton();

}
