package coreJava;

public class mainmethod {
	public static void main(String[] args) {
		System.out.println(method());
		method2();
		mainmethod refvar=new mainmethod();
		refvar.method3();
	}

	public static int method() {
		System.out.println("method-static ");
		int a = 12, b = 23;
		int sum = a + b;
		return sum;// method return value

	}

	public static void method2() {
		int a = 12;
		if (a > 13) {
			System.out.println(a);
//			return ;
		} else
			++a;

	}
	public void method3() {
		System.out.println("non-static method");
	}

}
