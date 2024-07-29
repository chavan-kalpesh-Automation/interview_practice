package interview_practice;

public class Second_Largest_From_Array {
	static int num = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		// To Find Seconds Largest Number from array use this print line
		System.out.print(arr[arr.length - 2]);
	}
}
