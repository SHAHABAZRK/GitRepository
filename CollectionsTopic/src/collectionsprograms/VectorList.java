package collectionsprograms;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		Vector v1 = new Vector(3);
		v1.add(10);
		v1.add('A');
		v1.add(10);
		v1.add(30.58);
		System.out.println("Vector size is "+v1.size());
		System.out.println("Vector capacity is "+v1.capacity());
	}

}
