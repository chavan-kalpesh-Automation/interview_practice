package pkg4OOPsConceptPolymorphism;

public class Class2Overloading extends Class1Overloading {

	public void verifyTitle(boolean b) {
		System.out.println("same method arument different ");

	}
	public static void main() {
		System.out.println("Overloading of main Method");
		
	}
	public static void main(int a) {
		System.out.println("Overloadning of main method with diff argument ");
	}

	public static void main(String[] args) {
		main();
		main(10);
		
		Class2Overloading obj = new Class2Overloading();
		obj.verifyTitle();
		obj.verifyTitle(true);
		System.out.println(obj.verifyTitle(11));
	}

}

//We can overloading main method becoz we can write method name as main 
