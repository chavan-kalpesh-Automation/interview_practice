package coreJava;

public class StackTraceMethod {
 public static void method() {
	 System.out.println("Print method one ");
	 String methodname=new Exception().getStackTrace()[0].getMethodName();
	 String classname=new Exception().getStackTrace()[1].getClassName();
	 System.out.println(methodname);
	
 }
 public static void methodsecond() {
	 String methodname=new Exception().getStackTrace()[0].getMethodName();
	 System.out.println(methodname);
 }
	public static void main(String[] args) {
		method();
		methodsecond();
	}

}
