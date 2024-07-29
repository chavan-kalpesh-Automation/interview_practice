package interview_practice;

public class Ascending_Descending_Order_Array {

	static int num = 0;

	public static void Acending_Order_Array() {
		int arr[] = { 2, 45, 32, 12, 33, 21 };


		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					num = arr[i];
					arr[i] = arr[j];
					arr[j] = num;

				}
			}
		}
		System.out.println("Ascending Order :");
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println("");
	}

	public static void Descending_Order_Array() {
		int arr[] = { 2, 45, 32, 12, 33, 21 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					num = arr[i];
					arr[i] = arr[j];
					arr[j] = num;

				}
			}
		}
		System.out.println("Descending Order :");
		for (int element : arr) {
			System.out.print(element + " ");
		}

	}

	public static void main(String[] args) {
		Acending_Order_Array();
		Descending_Order_Array();

	}
}
