package polymorphism;

public class OverridingClass1 extends OverridingClass {
	public void sameNameArgumentMethod() {
		System.out.println("sameNameArgumentMethod child class ");
	}

	
	public static void main() {
		System.out.println("overloading of main method with same name of method but argument are different");
	}
	public static void main(String[] args) {
		OverridingClass1 childobj = new OverridingClass1();
		childobj.sameNameArgumentMethod();

		// parent reference with child object
		OverridingClass parentobj = new OverridingClass();
		parentobj.sameNameArgumentMethod();

		main();
		
	}

}
//overriding is depends on runtime object
//jiska object hai compiler uski method suggest krga 