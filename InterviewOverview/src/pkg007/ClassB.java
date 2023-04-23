package pkg007;

public class ClassB {
	public ClassA method1() {
		System.out.println("ClassB return ClassA");
		return new ClassA();
	}

	public static void main(String[] args) {
		ClassB obj = new ClassB();
		obj.method1();

	}
}
