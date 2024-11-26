package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {

//		List Interface
//		Ordered Collection and Duplicate Allow
		
//		ArrayList
		ArrayList<String>names=new ArrayList<String>();
		names.add(0, "kalpesh");
		names.add(1, "Sanajay");
		names.add(2,"chavan");
		System.out.println("ArrayList "+names);
	
//		LinkedList
		List<Integer> linkedlist=new LinkedList<Integer>();
		linkedlist.add(0, 11);
		linkedlist.add(1,12);
		linkedlist.add(2,13);
		System.out.println("LinkedList "+linkedlist);
		
//		Vector
		Vector<String>vector=new Vector<String>();
		vector.add("101");
		vector.add(0, "100");
		vector.add(2,"104");
		vector.add(3,"103");
		System.out.println("Vector "+vector);
		
//		Stack
		Stack<Integer>stack=new Stack<Integer>();
		stack.push(5);
		stack.push(10);
		stack.push(15);
		stack.push(0);
		System.out.println("Stack "+stack);
		stack.pop();  //remove last add element ;no matter value
		System.out.println("Stack after pop " +stack);
		System.out.println("Stack peek value "+stack.peek());

		
	}

}
