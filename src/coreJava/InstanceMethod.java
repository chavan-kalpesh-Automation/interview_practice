package coreJava;

public class InstanceMethod {
	int a = 12;
	{
		System.out.println("Before COnstructor");
	}

	InstanceMethod() {
		System.out.println("Constructor");
	}

	void Test() {
		System.out.println("Method in Instance Class");
		System.out.println(new InstanceMethod());
	}

	public static void main(String[] args) {
		InstanceMethod instance = new InstanceMethod();
		instance.Test();
	}

}
