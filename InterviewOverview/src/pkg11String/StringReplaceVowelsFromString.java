package pkg11String;

public class StringReplaceVowelsFromString {

	public String removeVowels(String str) {
		return str.replaceAll("[AEIOUaeiou]", "");
	}

	public static void main(String[] args) {

		StringReplaceVowelsFromString obj = new StringReplaceVowelsFromString();

		System.out.println(obj.removeVowels("kalpesh Automation Tester"));

		String name = "Software Testing in Automation testing Selenium With Java";
		String removevowels = name.replaceAll("[AEIOUaeiou]", "");

		System.out.println("Original String : " + name);
		System.out.println("\n" + "String After removing vowels : " + removevowels);
	}

}
