package pkg7Exception;

public class ExceptionPractice {

	// Unexpected event occurs during execution of java program

	// Checked Exception(Compile Time Exception)
	// Thread.sleep(1000);-->InterruptedException

	// Unchecked Exception(RunTime Exception)

	public static void method1() throws InterruptedException {// Try catch block
		System.out.println("Test line ");

		Thread.sleep(3000);

		System.out.println("Test line after halt ");

	}

	public static void main(String[] args) throws InterruptedException {
		method1();
	}

}
