package interview_practice;

public class Swapping_Of_Numbers_With_help_of_Third_Var {
	public static void main(String[] args) {
		int num1 = 43;
		int num2 = 34;

		System.out.println("Actual Value of num1:" + num1);
		System.out.println("Actual Value of num2 :" + num2);

		int num3;
		num3 = num1;
		num1 = num2;
		num2 = num3;
		System.out.println("After swapping Value of num1 :" + num1);
		System.out.println("After swapping Value of num2 :" + num2);

	}
}
