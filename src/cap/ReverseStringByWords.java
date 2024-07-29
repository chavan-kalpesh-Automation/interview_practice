package cap;

public class ReverseStringByWords {

	public static void main(String[] args) {
		String name = "I Love Java";
		String[] splitname = name.split(" ");

		StringBuilder build = new StringBuilder();

		for (int i = splitname.length - 1; i >= 0; i--) {

			build.append(splitname[i]);

			if (i != 0) {
				build.append(" ");

			}
		}

		System.out.println(build);
	}
}
