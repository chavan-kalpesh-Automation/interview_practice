package inheritancee;

public class ChildClass1 extends ParentClass {

	int a = 20;
	static int b = 22;

	public void method() {

		System.out.println(a);//20
		System.out.println(super.a);//10
	}

	public static void main(String[] args) {
		ChildClass1 obj = new ChildClass1();
		obj.method();
		
	//call parent class nonstatic variable
		ParentClass obj1=new ParentClass();
		System.out.println(obj1.a);//10
		
		
		System.out.println(ParentClass.b);//parent class static variable 
		System.out.println(b);//Child class static variable 
		
		System.out.println(obj.a);
		System.out.println(b);
		System.out.println(b);

	}

}
