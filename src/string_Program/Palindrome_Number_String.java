package string_Program;

public class Palindrome_Number_String {

	public static void main(String[] args) {
		String number = "12321";
		char arr[] = number.toCharArray();
		String rev = "";
		for (int i = number.length() - 1; i >= 0; i--) {
			rev = rev + arr[i];

		}
		System.out.println("");
		if (number.equals(rev)) {
			System.out.println(number+" is Palindrome Number");
		} else
			System.out.println(number+" is Not Palindrome Number "+rev);

	}
}
