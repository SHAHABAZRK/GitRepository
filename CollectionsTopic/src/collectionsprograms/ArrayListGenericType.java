package collectionsprograms;

import java.util.ArrayList;

public class ArrayListGenericType {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(70);
		l1.add(90);
		l1.add((int) 'A');
		
		System.out.println(l1);
		
		System.out.println("****************");
		
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		
		

	}

}
