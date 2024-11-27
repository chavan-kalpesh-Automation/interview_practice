package pkg11String;

public class StringPalindrome {

	public static void main(String[] args) {
		String name = "lol";
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);

		}
		if (rev.equals(name)) {
			System.out.println("Given String is Palindrome String");
		} else
			System.out.println("Given String is not Palindrome String");
		}
	

}
