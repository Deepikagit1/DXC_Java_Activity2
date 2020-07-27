package Assignment;

import java.util.LinkedList;


public class QueueOperations2 {


	public static void main(String[] args) {
		
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.addFirst(100);
		queue.addLast(200);
		queue.addLast(300);
		queue.addLast(400);
		queue.addFirst(50);
		queue.push(500);
		queue.addFirst(150);
		queue.pop();
		//queue.peekLast();
		int size = queue.size();
		System.out.println(queue.contains(300));
		System.out.println(queue);
        System.out.println(size);
        System.out.println(queue.isEmpty());
       
	}

}
