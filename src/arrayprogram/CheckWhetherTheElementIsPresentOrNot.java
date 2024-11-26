package arrayprogram;

public class CheckWhetherTheElementIsPresentOrNot {

	public static void main(String[] args) {

		int array[] = { 2, 23, 5, 9, 11, 19, 95 };

		int number = 11;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == number) {
				System.out.println("Given number is present");
				break;
			}
			else {
				System.out.println("Given Number is not present");
//				break;
			}
		}

	}

}

