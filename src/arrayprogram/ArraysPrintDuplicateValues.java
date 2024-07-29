package arrayprogram;

public class ArraysPrintDuplicateValues {

	public static void main(String[] args) {
		int[] array = { 1, 22, 31, 34, 43, 1, 31, 55, 43 };

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				if(array[i]==array[j]) {
					System.out.println(array[j]);
				}
			}
		}
	}

}
