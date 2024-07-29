package polymorphism;

public class OverloadingClass1 {

	public static void sameNameMethod(boolean b) {
		System.out.println("sameNameMethod with boolean  arguments");
	}
	public static void main(String[]args) {
		sameNameMethod(true);
		//overloading is depends on reference variable 
		OverloadingClass.sameNameMethod();
		
	}
}
