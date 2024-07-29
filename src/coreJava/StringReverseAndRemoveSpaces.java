package coreJava;

public class StringReverseAndRemoveSpaces {

	public static void main(String[] args) {

		String fullname = "navahC yajnaS hseplaK";

		fullname = fullname.replaceAll("\\s", "");
		String name = "";
		for (int i = fullname.length() - 1; i >= 0; i--) {
			name = name + fullname.charAt(i);
		}
		System.out.println(name);

	}
}
