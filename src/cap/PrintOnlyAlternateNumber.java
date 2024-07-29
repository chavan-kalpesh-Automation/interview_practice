package cap;

public class PrintOnlyAlternateNumber {
public static void main(String []args) {
	
	int []array = {1,2,3,4,5,6,7,8,9,10,11};//1,3,5,7,9
	
	for(int i=0;i<=array.length-1;i+=2) {
		System.out.print(array[i]+" ");
	
	}
	
}
}
