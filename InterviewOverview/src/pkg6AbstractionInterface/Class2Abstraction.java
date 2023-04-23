package pkg6AbstractionInterface;

public abstract class Class2Abstraction extends Class1Abstract {

	@Override
	void loginbtn() {
		// TODO Auto-generated method stub
		System.out.println("login button ");
	}

	abstract void forgotbtn();

	public static void method() {
System.out.println("static method in abstract class");
	}
	public static void main (String[]args) {
		method();
	}
}
