package interview_practice;

public class Swap_Numbers_Without_Third_Variable {
	public static void main(String[] args) {
		int num1 = 34;
		int num2 = 43;
		System.out.println("Actual Value of num1:" + num1);
		System.out.println("Actual Value of num2 :" + num2);
		 num1 = num1 + num2; //77
		 
		num2=num1-num2;
		System.out.println("After swapping Value of num2 :" + num2);
		num1 = num1 - num2;
		System.out.println("After swapping Value of num1 :" + num1);
		
		
		
		
	}
}
