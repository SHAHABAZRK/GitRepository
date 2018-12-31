package collectionsprograms;

import java.util.PriorityQueue;

public class PriorityQueueSample1 {

	public static void main(String[] args) {
		PriorityQueue p1 = new PriorityQueue();
		p1.add(80);
		p1.add(30);
		p1.add(60);
		p1.add(90);
		
		System.out.println(p1);

		System.out.println(p1.peek());
		System.out.println(p1);
		
		System.out.println(p1.peek());
		System.out.println(p1);
	}

}
