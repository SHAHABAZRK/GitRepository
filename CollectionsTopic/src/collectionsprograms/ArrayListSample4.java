package collectionsprograms;

import java.util.ArrayList;

public class ArrayListSample4 {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("Delhi");
		l1.add("Bengaluru");
		l1.add("Mandya");
		l1.add("Mumbai");
		l1.add("Goa");
		
		System.out.println("Before \n"+l1);
		
		l1.remove(1);
		
		System.out.println("After \n"+l1);
		
		l1.remove("Goa");
		
		System.out.println("After \n"+l1);
	}

}
