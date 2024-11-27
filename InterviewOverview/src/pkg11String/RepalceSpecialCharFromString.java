package pkg11String;

public class RepalceSpecialCharFromString {

	public static void main(String[] args) {
		String name = "K@lpe$#C#@v@n";
		String replaceSpclChr = name.replaceAll("[^A-Za-z0-9", "");
		
		System.out.println(replaceSpclChr);
		
	}

}
