package pkg9Assertion;

public class AssertionClass {
	public static void main(String[] args) {
		int age = 10;
		
		assert age >= 18 : "Age Should be 18";
		
		System.out.println("The Voter Age is  " + age);
		
	}
}
