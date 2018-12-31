package advancedcollections;

import java.util.ArrayList;
import java.util.List;

public class MainClass1 {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		
		Employee e1 = new Employee("Kariya",90,12000.0);
		Employee e2 = new Employee("Kencha",60,10000.0);
		Employee e3 = new Employee("Ranbir",39,15000.0);
		
		Student s1 = new Student("Harshith",26,69.9);
		Student s2 = new Student("Kishore",28,79.9);
		Student s3 = new Student("Harish",29,89.9);
		
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		
		for(Object l2:l1)
		{
			System.out.println(l2);
		}
	}

}
