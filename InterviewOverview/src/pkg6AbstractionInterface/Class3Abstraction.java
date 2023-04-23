package pkg6AbstractionInterface;

public class Class3Abstraction extends Class2Abstraction {
	// abstract class can not used to create object
	// we can not create object of abstract class

	@Override
	void forgotbtn() {
		// TODO Auto-generated method stub
		System.out.println("Forgot button");
	}

	public static void method() {
		System.out.println("static method");
	}

	public void method2() {
		System.out.println("Non static method");
	}

	public static void main(String[] args) {
		Class3Abstraction obj = new Class3Abstraction();
		obj.forgotbtn();
		method();
		obj.method2();

	}

}
