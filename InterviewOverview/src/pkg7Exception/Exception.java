package pkg7Exception;

public class Exception {
	// Exception is unexpected event occurs during execution of java program which
	// disrupt normal flow of the program .

	// 1)Checked Exception(Compile time exception)
	// 2)Unchecked Exception(RunTime Exception)

	public static void main(String args[]) throws InterruptedException {
		String name = "kalpesh";
		Thread.sleep(2000);// Compile time exception( Checked Exception)
		for (int i = 0; i < name.length(); i++) {
			System.out.print(name.charAt(i));
		}
		System.out.println(100 / 0);// Runtime Exception(Unchecked Exception)
	}
}
