package arrayprogram;

public class StringMethods {

	public static void main(String[] args) {

		String name="kalpesh sanjay chavan";
		String name1=" Rohini kalpesh chavan";
		
		//charAt
		char charAtValue=name.charAt(3);
		System.out.println(charAtValue);
		
		//concat -join two strings 
		String concatStrings=name.concat(name1);
		System.out.println(concatStrings);
	
		//equals -compare two string and return boolean output 
		
		boolean equalsString =name.equals(name1);
		System.out.println(equalsString);
		
		
	}

}
