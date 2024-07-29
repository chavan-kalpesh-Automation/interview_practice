package coreJava;

import java.util.ArrayList;

public class DeclarationOfArrayLists {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		
		names.add(0,"Kalpesh");
		names.add(1, "Sanjay");
		names.add(2, "chavan");
		
//		System.out.println(names);
		names.add(3, null);
		names.add(4, "Suananda");
		names.remove(3);
		System.out.println(names);
		
	}
}
