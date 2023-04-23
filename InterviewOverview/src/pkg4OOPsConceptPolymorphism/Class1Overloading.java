package pkg4OOPsConceptPolymorphism;

public class Class1Overloading {
	// polymorphism -->methods having different form with same name is called
	// polymorphism
	// #1.Overloading -->method can be called as overloaded method when method name
	// same but arguments are different in same class as well as inherited class

	public void verifyTitle() {
		System.out.println("Title");
	}

	public boolean verifyTitle(int num) {
		return true;
	}

	public static void main(String[] args) {
		Class1Overloading obj = new Class1Overloading();

		obj.verifyTitle();
		System.out.println(obj.verifyTitle(10));
		
		

	}

}
