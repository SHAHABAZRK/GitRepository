package advancedcollections;

import java.util.List;

public class Manager {

	public static void approve(List l1, double newsalary) {
		
		for(Object l2:l1){
			if(l2 instanceof Employee){
		Employee emp = (Employee) l2;
		if(emp.name.equals("Kariya"))
				{
					emp.hike(newsalary);
				}
	}
	}
	}
}
