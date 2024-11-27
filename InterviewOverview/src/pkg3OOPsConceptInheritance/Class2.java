package pkg3OOPsConceptInheritance;

public class Class2 extends Class1 {

	public void signIn() {
		System.out.println("signIn btn child class");
	}

	public static void main(String[] args) {
		Class2 obj = new Class2();
		obj.homepagebtn();
		obj.signIn();
	}
}
