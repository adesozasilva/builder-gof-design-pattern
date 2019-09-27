package br.com.adesozasilva.gofdesigpatterns.abstractfactory;

public class FactoryProvider {
    
	public static AbstractFactory<?> getFactory(String choice){
         
        if("ORACLE".equalsIgnoreCase(choice)){
        	return new OracleConnectionFactory();
        }
        else if("MYSQL".equalsIgnoreCase(choice)){
            return new MySqlConnectionFactory();
        }
         
        return null;
    }
}