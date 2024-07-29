package inheritancee;

public class ChildClass2 extends ChildClass1{
	
	
	
	public ChildClass2() {
		super();
		System.out.println("child Class Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass1 obj=new ChildClass2();
		obj.method();
		
		ParentClass object=new ChildClass2();
object.parentclassmethod();

	}

}
