package xceedance;

import java.util.Arrays;

public class SortingArrrayUsingArraysSortMethod {

	public static void main(String[] args) {

		int [] array=new int[8];
		
		
		int [] sortarrays = {12, 55, 88, 44, 55, 66, 88, 99, 77, 44, 100 };
		
		Arrays.sort(sortarrays);
		
		
		for(int i=0;i<sortarrays.length;i++) {
			System.out.print(sortarrays[i]+" ");
		}
	}

}
