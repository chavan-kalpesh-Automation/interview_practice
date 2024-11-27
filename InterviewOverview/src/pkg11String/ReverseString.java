package pkg11String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "AUTOMATION";
		String rev = "";

		for (int i = name.length() - 1; i>= 0; i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);
	}

}
