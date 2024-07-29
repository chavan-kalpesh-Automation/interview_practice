package arrayprogram;

public class FindSecondLasgestFrom_Array {

	public static void main(String[] args) {

		int[] arr = { 10, 11, 81, 69, 1, 32, 65, 41 };
		int num;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					num = arr[i];
					arr[i] = arr[j];
					arr[j] = num;

				}
			}
		}
		int secondlargest = arr.length - 2;

		System.out.print("Second Largest Number from array : " + arr[secondlargest] + " ");

	}

}
