package collectionsprograms;

import java.util.ArrayList;

public class ArrayListSample2 {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println("******Before*******");
		System.out.println(l1);
		System.out.println("******After*******");
		l1.add(2,'A');
		System.out.println(l1);
	}

}
