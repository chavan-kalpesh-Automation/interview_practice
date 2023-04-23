package pkg6AbstractionInterface;

public interface Class4Interface {
	// interface is class but not class
	// it is blueprint of class
	// it is reference type of class
	// interface is similar to class but not class

	// interface contains 100% abstract class
	// even if we do not mention abstract in front of method all method present in
	// interface are by default public abstract


public abstract void main();

public static void m1() {
	System.out.println("static method in interface");
	
}
public void m2();
abstract void m11();
//abstract void m22();//same method name but argument are different jvm will confuse which method to iimplement 
public static void main(String[]args) {
	m1();
	
	
}

}
