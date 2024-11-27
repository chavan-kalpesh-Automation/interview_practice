package pkg7Exception;

public class ExceptionHandeling02 {
	// Exception handling - Checked Exception (Compile time Exception)
	public static void main(String[] args) throws Throwable {
		System.out.println(1);
		Thread.sleep(2000);
		System.out.println(2);
		System.out.println(3 / 0);//Checked Exception cannot handle Unchecked Exception
	}
}
