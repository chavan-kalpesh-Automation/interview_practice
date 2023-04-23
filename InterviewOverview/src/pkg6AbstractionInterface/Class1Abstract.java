package pkg6AbstractionInterface;

public abstract class Class1Abstract {

	// Abstraction -->It is process of hiding implementation details and showing
	// only functionality to the user
	// way to achieve abstraction in java
	// #1.Abstract (0 to 100% abstract method)
	// #2.Interface (100% abstract method)
	// Abstract is non access modifier
	// abstract class is not used to create object in it
	// abstract method used only in the abstract class.abstract method can not have
	// body,the body is provided in inherited class

	public void username() {
		System.out.println("UserName ");
	}

	public void pasword() {
		System.out.println("Password");
	}
abstract void loginbtn();

}
