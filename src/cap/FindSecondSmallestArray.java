package cap;

public class FindSecondSmallestArray {

	public static void main(String[] args) {

		
		int [] array= {22,43,26,55,45,56,80,75,54};
		
		int num;
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
				num=array[i];
				array[i]=array[j];
				array[j]=num;
				
			}
		}
	}
		System.out.println("Second Smallest Array from list : "+array[1]);
	}
}
