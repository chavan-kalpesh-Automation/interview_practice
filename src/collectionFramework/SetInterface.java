package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {

		
//		Set is an interface which implements Hashset,Linkedhashset
//		Set is unordered and does not allow duplicate values 
		
		
//		HashSet 
		Set<Integer>hashset=new HashSet();
		hashset.add(20);
		hashset.add(4);
		hashset.add(6);
		hashset.add(6);  //Duplicate Value
		hashset.add(100);
		hashset.add(200);
		System.out.println("HashSet (Unordered) "+hashset);
		
//		LinkedhashSet
		LinkedHashSet<Integer>linkedhashset=new LinkedHashSet();
		linkedhashset.add(10);
		linkedhashset.add(20);
		linkedhashset.add(20);
		linkedhashset.add(30);
		System.out.println("LinkedHashSet (Ordered +unique value)"+linkedhashset);
		
//		TreeSet
		TreeSet<Integer>treeSet=new TreeSet();
		treeSet.add(100);
		treeSet.add(10);
		treeSet.add(10);
		treeSet.add(5);
		System.out.println("TreeSet(Ascending Order+Unique) "+treeSet);
		
		
	}

}
