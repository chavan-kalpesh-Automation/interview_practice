package pkg10Array;

public class SortingOfArrayAscendingOrder {
	static int empty;

	public static void main(String[] args) {
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
		System.out.println("Sorting of Array in Ascending Order" + "\n");
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
	}
}
