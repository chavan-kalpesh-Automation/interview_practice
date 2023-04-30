package pkg18propertiesfile;

import java.io.IOException;

public class SimpleProp extends SimpleProg {
	
public  SimpleProp() {
	super();
	try {

		prop.load(ipFile);
		System.out.println(prop.getProperty("Url"));

	} catch (IOException e) {
		e.printStackTrace();
	}
}

	

	public static void main(String[] args) {
		SimpleProp obj=new SimpleProp();
		
	}
}
