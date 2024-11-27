package pkg7Exception;

public class ExceptionPractice01 {
	// Unchecked exception
	// Handled using try catch block

	public static void method() {
		System.out.println(1);
		System.out.println(2);
		try {

			System.out.println(3 / 0);
		} catch (ArithmeticException e) {

			System.out.println("can't devide by zero ");
		}

		System.out.println(4);
		System.out.println(5);
	}

	public static void method1() throws InterruptedException {

		System.out.println(1);
		System.out.println(2);
		try {

			System.out.println(3 / 0);
		} catch (ArithmeticException w) {

			System.out.println("Exception can't devide by zero");
		}

		System.out.println(4);
		System.out.println(5);
		Thread.sleep(1000);
	}

	public static void main(String[] args) throws InterruptedException {
		method();
		method1();

	}

}
