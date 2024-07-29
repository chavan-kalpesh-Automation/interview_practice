package polymorphism;

public class OverloadingClass {
//A Method can be called as overloaded method when name of method is same but the arguments are different in same class or in inherited class

	public static void sameNameMethod() {
		System.out.println("sameNameMethod  without arguments");
	}

	public static void sameNameMethod(int a) {
		System.out.println("sameNameMethod with arguments");
	}
	
	public void method() {
		System.out.println("method without argument");
	}
	public void method(boolean b) {
		System.out.println("method with boolean argument ");
	}
	public static void main(String []args) {
		OverloadingClass obj=new OverloadingClass();
		obj.method();
		obj.method(false);
	}
}
