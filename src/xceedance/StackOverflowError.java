package xceedance;

public class StackOverflowError {
	public static void method1() {
		System.out.println("Method 1 is running ");
		method2();
	}

	public static void method2() {
		System.out.println("Method 2 is Running");
		method1();

	}

	public static void main(String[] args) {
			method1();
	}
}
