package cap;

public class ExtractNumebrFromString {
	public static void main(String[] args) {
		String name = "JavaLearning 2024 test 20124";

		String[] parts = name.split("\\s+");
		for (String part : parts) {
			if (part.matches("\\d+")) {
				System.out.println(part);
			}
		}
	}

}
