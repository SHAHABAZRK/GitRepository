package collectionsprograms;

import java.util.LinkedHashSet;

public class LinkedHashSetSample1 {

	public static void main(String[] args) {
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(10);
		l1.add(30.58);
		l1.add('A');
		l1.add("Hello");
		l1.add(10);
		l1.add(null);
		
		System.out.println(l1);
	}

}
