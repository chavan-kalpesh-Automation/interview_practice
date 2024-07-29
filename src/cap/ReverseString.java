package cap;

public class ReverseString {
public static void main(String []args) {
	String name ="I Love Java";
	
	char []array=name.toCharArray();
	
	for(int i=array.length-1;i>=0;i--) {
		System.out.print(array[i]);
	}
}
}
