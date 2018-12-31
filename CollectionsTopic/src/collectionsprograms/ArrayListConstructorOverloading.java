package collectionsprograms;

import java.util.ArrayList;

public class ArrayListConstructorOverloading {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		
	l1.add(10);
	l1.add(60);
	l1.add(10);
	l1.add(80);

	System.out.println("l1--->"+l1);
	
	ArrayList l2 = new ArrayList(l1);
	
	System.out.println("l2--->"+l2);
	}

}
