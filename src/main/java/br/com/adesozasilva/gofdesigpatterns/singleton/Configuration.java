package br.com.adesozasilva.gofdesigpatterns.singleton;

public class Configuration {
	
	private static final Configuration SINGLE_INSTANCE = new Configuration();
	private final String name = "Default Configuration";
	
	private Configuration() {}
	
	public static Configuration getInstance() {
		return SINGLE_INSTANCE;
	}
	
	public String getName() {
		return name;
	}

}
