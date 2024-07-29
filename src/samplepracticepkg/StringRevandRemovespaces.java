package samplepracticepkg;

public class StringRevandRemovespaces {

	public static void main(String[] args) {
		String fullname = "kalpesh sanjay chavan";
		fullname = fullname.replaceAll(" ", "");
		String rev = "";

		for (int i = fullname.length() - 1; i >= 0; i--) {
			rev = rev + fullname.charAt(i);
		}
		System.out.println(rev);
	}
}
