package arrayprogram;

import java.util.Arrays;

public class PracticeClass {
	public static void main(String[] args) {
		int array1[] = { 2, 3, 4, 1, 2 };
		int array2[] = { 1, 5, 6, 7, 8, 3 };

		int lengtharr1 = array1.length;
		int lengtharr2 = array1.length;
		
		int num;
		for(int i=0;i<=array1.length-1;i++) {
			for(int j=i+1;j<=array1.length-1;j++) {
				if(array1[i]>array1[j]) {
					num=array1[i];
					array1[i]=array1[j];
					array1[j]=num;
				}
			}
		}
//		for(int i=0;i<array1.length;i++) {
//			System.out.println(array1[i]);
//		}
		
		
		
		int merger_array[] = new int[lengtharr1 + lengtharr2];

		int i = 0, j = 0, k = 0;

		while (i < lengtharr1 && j < lengtharr2) {
			if (array1[i] < array2[j]) {
				merger_array[k++] = array1[i++];
			} else {
				merger_array[k++] = array2[j++];
			}

		}
		while(i<lengtharr1 ) {
			merger_array[k++]=array1[i++];
		}
		while (j<lengtharr2) {
			merger_array[k++]=array2[j++];
		}
		System.out.println(Arrays.toString(merger_array));
	}
}
