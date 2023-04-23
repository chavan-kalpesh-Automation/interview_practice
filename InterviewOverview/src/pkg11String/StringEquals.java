package pkg11String;

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "SNDK CORP";
		String location = "sndk corp";
		boolean result = name.equals(location);
		boolean resultnew = name.equalsIgnoreCase(location);
		
	System.out.println(result);
	System.out.println(resultnew);
	}

}
