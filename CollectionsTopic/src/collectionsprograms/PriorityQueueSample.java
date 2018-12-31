package collectionsprograms;

import java.util.PriorityQueue;

public class PriorityQueueSample {

	public static void main(String[] args) {
		PriorityQueue q1 = new PriorityQueue();
		q1.add(20);
		q1.add(60);
		q1.add(10);
		q1.add(90);
		
		System.out.println(q1);

		System.out.println(q1.poll());
		System.out.println(q1);
		
		System.out.println(q1.poll());
		System.out.println(q1);
	}

}
