package pkg10Array;

public class FindHighestNum {
	// Print the highest and second highest integer from the array
	public static void main(String[] args) {
		int empty;
		int[] array = { 1, 3, 4, 2, 67, 45, 77, 81, 94, 55, 34 };

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					empty = array[i];
					array[i] = array[j];
					array[j] = empty;

				}
			}

		}
		int max = array.length;
		int secondmax = array.length - 2;
		for (int k = secondmax; k < max; k++) {
			System.out.println(array[k]);
		}
	}

}
