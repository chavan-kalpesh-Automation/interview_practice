package pkg7Exception;

public class ExceptionSample {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(2000);                     // Checked exception
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3 / 0);        // Unchecked exception
		} catch (ArithmeticException e) {
			System.out.println(e);

		}
		System.out.println(4);
	}
}
