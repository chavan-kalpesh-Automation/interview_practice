package pkg6AbstractionInterface;

public interface Class5Interface {

	public static void m1() {
		System.out.println("output");
	}

	public void m2();

	void m3();

	abstract void m4();

	public abstract void m5();

	void m5(int num);//overloaded method m5(int num) & when we implement it override in next class
	abstract void m11();//same method name and argument method present in parent implemented classes then it will call once
//abstract boolean m22();
//same method name but return type different then jvm will confuse which method to implement 
}
