package collectionsprograms;

import java.util.ArrayList;

public class ArrayListContainsMethod {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
	
		if(l1.contains(40))
		{
			System.out.println("It is present..........");
		}
		else
		{
			System.out.println("It's not present.........");
		}
	}

}
