package collectionFramework;

import java.util.Arrays;

public class Class {
	public static void main(String[] args) {
		int[] array = { 1, 3, 45, 69, 80 };
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
//		int second =array.length-2;
//		System.out.println(array[second]);
		System.out.println(array[array.length-2]);
	
	//By using Arrays.sort method 
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	
	}
	

}
