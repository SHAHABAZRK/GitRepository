package collectionsprograms;

import java.util.ArrayList;

public class ArrayListRevArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70};
		ArrayList l1 = new ArrayList();
		for (int i = arr.length-1; i >= 0 ; i--) {
			System.out.println(arr[i]);
			l1.add(arr[i]);
		}
		System.out.println(l1);

	}

}
