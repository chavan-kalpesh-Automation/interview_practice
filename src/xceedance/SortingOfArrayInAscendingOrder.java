package xceedance;

public class SortingOfArrayInAscendingOrder {

	static int store;
	public static void main(String []args) {
		
		int []sort= {12, 55, 88, 44, 55, 66, 88, 99, 77, 44, 100 };
		
		for(int i=0;i<sort.length;i++) {
			for(int j=i+1;j<sort.length;j++) {
				
			if(sort[i]>sort[j]) {
				store=sort[i];
				sort[i]=sort[j];
				sort[j]=store;
			}
				
			}
		}
		
		for(int i=0;i<sort.length;i++) {
			System.out.print(sort[i]+" ");
		}
		
	}
}
