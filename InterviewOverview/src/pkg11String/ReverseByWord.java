package pkg11String;

public class ReverseByWord {

	public static void main(String[] args) {
		String name = "Kalpesh sanjay Chavan";
		String[] split = name.split(" ");
		String rev = "";
		for (int i = split.length - 1; i >= 0; i--) {

			rev = rev + split[i];

		}
		System.out.println(rev);
	}
}
