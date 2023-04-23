package pkg10Array;

public class Class1 {
	// Array is non primitive data types
	// Array consist of container object which holds the fix number of value

	// declaration if array
	public void arraydeclration1() {
		// Using new Keyword
		int[] arraycall = new int[5];
		arraycall[0] = 100;
		arraycall[1] = 101;
		arraycall[2] = 102;
		arraycall[3] = 103;
		arraycall[4] = 104;
		for (int i = 0; i < 5; i++) {
			System.out.println(arraycall[i]);
		}

	}

	public void arraydeclration2() {
		int[] arraycall = { 200, 201, 202, 203, 204, 205 };
		for (int i = 0; i < arraycall.length; i++) {
			System.out.println(arraycall[i]);

		}
	}
public void arrayString1() {
	String [] arrayString= {"Kalpesh","rohit","omkar","komal","nivedita"};
	for(int i=0;i<arrayString.length;i++) {
		System.out.println(arrayString[i]);
	}
}
	public static void main(String[] args) {
		Class1 obj = new Class1();
		obj.arraydeclration1();
		obj.arraydeclration2();
		obj.arrayString1();
	}

}
