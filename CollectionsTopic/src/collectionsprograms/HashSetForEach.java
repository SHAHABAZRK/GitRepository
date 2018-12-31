package collectionsprograms;

import java.util.HashSet;

public class HashSetForEach {

	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		h1.add(10);
		h1.add(30.56);
		h1.add('A');
		h1.add("Hello");
		h1.add(10);
		h1.add(null);
		for(Object obj:h1)
		{
			System.out.println(obj);
		}
		
	}
}

