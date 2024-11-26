package collectionFramework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueInterface {
	public static void main(String[] args) {

//	Queue Interface 	
//		FIFO -First In First Out
		
		
//		LinkedList
		Queue<Integer>linkedlist=new LinkedList<Integer>();
		linkedlist.add(10);
		linkedlist.add(20);
		linkedlist.add(30);
		linkedlist.add(40);
		
		System.out.println(linkedlist);
		linkedlist.offer(50);
		System.out.println(linkedlist);
		
		linkedlist.poll();
		System.out.println(linkedlist);
		linkedlist.peek();
		System.out.println(linkedlist);
	
//	PriorityQueue
//		ordered elements based on priority instead of priority
		
		Queue<Integer>priorityqueue=new PriorityQueue<Integer>();
		priorityqueue.add(10);
		priorityqueue.add(11);
		
	
	
	}
}
