package collectionsprograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCollections {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add(110);
		l1.add(80);
		l1.add(90);
		
		System.out.println("******** Before sort ********");
		System.out.println(l1);
		Collections.sort(l1);

		System.out.println("******** Before sort ********");
		System.out.println(l1);
	}

}
