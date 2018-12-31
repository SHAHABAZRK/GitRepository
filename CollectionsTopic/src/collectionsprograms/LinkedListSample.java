package collectionsprograms;

import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		
		l1.add(10);
		l1.add(null);
		l1.add(10);
		l1.add(30.58);
		l1.add('A');
		l1.add("HAH");
		
		System.out.println(l1.get(3));
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1.contains(10));
		System.out.println(l1);
	}

}
