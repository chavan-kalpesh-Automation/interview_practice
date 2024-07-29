package xceedance;

public class CheckedException {

	// Exception is unexpected event which occurs during execution of java program
	// which disturb the normal flow of the program
	// there are two types of exception
	// 1)Checked Exception (Compile time exception)
	// 2)Unchecked Exception (Runtime Exception)

	// Exception Handling is the process of handling unexpected event,which causing
	// an abnormal termination of java program ,in such way that program will
	// execute normally

	// 1)try-catch-finally -Inside try block will write the risky code which may
	// cause an exception
	// 2)In the catch block we will write the code which can tells us to bypass the
	// situation on which we get the exception

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Exception Occurs can't divide by zero ");
		} catch (NullPointerException e) {
			System.out.println("Null POinter Exception");
		} catch (Exception e) {
			System.out.println("Parent calss of exception");
		} finally {
			System.out.println("Securely Closed all the access which is open previousely");
		}
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);

	}

}
