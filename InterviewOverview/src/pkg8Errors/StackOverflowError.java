package pkg8Errors;

public class StackOverflowError {
	
	
	public static void method1() {
		System.out.println("Method1");
		method2();
	}
	public static void method2() {
		System.out.println("Method2");
		method1();
		
	}
	
	

	public static void main(String[] args) {
method1();

	}

}
