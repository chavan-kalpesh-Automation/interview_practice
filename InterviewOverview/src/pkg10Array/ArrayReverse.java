package pkg10Array;

public class ArrayReverse {

	public static void main(String[] args) {
		int[] array = { 1, 3, 4, 2, 67, 45, 77, 81, 94, 55, 34 };
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]+"  ");
		}
	}

}
