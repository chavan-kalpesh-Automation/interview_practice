package pkg7Exception;

public class ExceptionHandeling01 {
//Exception Handling - Unchecked Exception (Runtime Exception)
	public static void main(String[] args) {
		System.out.println(1);
		
		System.out.println(2);
		
		System.out.println(3);
		try {
			System.out.println(100 / 0);
		} 
		catch (ArithmeticException e) {
			System.out.println("Can't devide by zero"+e.getMessage());
		}
		
		System.out.println(4);
		
		System.out.println(5);

	}
}
