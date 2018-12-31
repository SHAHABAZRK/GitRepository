package collectionsprograms;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedObjectsCollection {

	public static void main(String[] args) {
		List<Mobile> l1 = new ArrayList<Mobile>();
		l1.add(new Mobile());
		l1.add(new Mobile());
		l1.add(new Mobile());
		Mobile m1 = (Mobile) l1.get(2);
		m1.call();
		m1.chat();
	}

}
class Mobile
{
	void call()
	{
		System.out.println("Miss Call.......");
	}
	void chat()
	{
		System.out.println("Good Morning.......");
	}
}
