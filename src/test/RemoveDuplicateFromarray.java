package test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromarray {

	public static void main(String []args) {
		int [] number = {2,5,3,3,2,0,1,2};
	
		Set<Integer>uniqueset=new HashSet<Integer>();
		
		for(int num:number) {
uniqueset.add(num);
		}
		System.out.println(uniqueset);
		
	}
}
