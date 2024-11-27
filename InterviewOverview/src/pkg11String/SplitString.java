package pkg11String;

public class SplitString {
	// String concat is used to join two string
	public static void main(String[] args) {
		String names = "kalpesh kajal dhanusha parth jainil ";
		String[] split = names.split("\\s");
		for (String splits : split) {
			System.out.println(splits);
		}
	}
}
