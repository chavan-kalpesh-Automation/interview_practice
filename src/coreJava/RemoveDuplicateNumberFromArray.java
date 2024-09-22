package coreJava;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumberFromArray {

	public static void main(String[] args) {
		int arrays[] = { 1, 1, 2, 3, 2, 3,1,4,0,4,5 };

		Set<Integer> uniqueSet = new HashSet<>();
		for (int num : arrays) {
			uniqueSet.add(num);
		}
	System.out.println("Unique Elements From Arrays :"+uniqueSet);
	
	}

}

