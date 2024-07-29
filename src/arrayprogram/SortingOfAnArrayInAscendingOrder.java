package arrayprogram;

import java.util.Arrays;

public class SortingOfAnArrayInAscendingOrder {

	public static void main(String[] args) {
		int[] array = { 22, 23, 12, 34, 54, 45, 47, 23, 11 };
		int num;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					num = array[i];
					array[i] = array[j];
					array[j] = num;

				}
			}
		}
		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " ");
		}
		System.out.println( " ");

	//another Method of sorting an array 
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
			
		}
	
	
	
	
	}
	

}
