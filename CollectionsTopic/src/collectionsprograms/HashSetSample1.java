package collectionsprograms;

import java.util.HashSet;

public class HashSetSample1 {

	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		h1.add(10);
		h1.add(30.58);
		h1.add('A');
		h1.add('A');
		h1.add("Hello");
		h1.add(10);
		h1.add(null);
		
		System.out.println(h1);
	}

}
