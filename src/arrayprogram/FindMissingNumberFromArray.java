package arrayprogram;

public class FindMissingNumberFromArray {

	public static void main(String []args) {
		int array[]= {1,2,3,4,6};
		
		int length =array.length+1;	
	
		
		int sum=length*(length+1)/2;
		
//		System.out.println(sum);
	int numsum=0;
	for(int num:array) {
		
		numsum +=num;
		
//		System.out.println(numsum);
		
	}
	System.out.println(sum-numsum);
	
	
	}
	
}
