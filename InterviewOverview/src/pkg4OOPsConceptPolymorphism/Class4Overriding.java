package pkg4OOPsConceptPolymorphism;

public class Class4Overriding extends Class3Overriding {

	public void method1() {
		System.out.println("Method1 Child Class");

	}

	// Constructor and static method & variable can not follow overriding concept

	// we can not override static method -->overriding depends on runtime object and
	// we can not create obj for static method

	public static void method2() {
		System.out.println("Method2 static child class");
	}

	// porga bapala ref nhi deu shkt
	public static void main(String[] args) {
		Class3Overriding obj = new Class4Overriding();
		obj.method1();
		Class3Overriding obj1 = new Class3Overriding();
		obj1.method1();
		method2();
		Class3Overriding.method2();
	}
}
