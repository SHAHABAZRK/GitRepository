package advancedcollections;

public class Employee extends Person{
	double salary;
	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}
	public void hike(double updatedSalary)
	{
		salary=salary+updatedSalary;
	}

}
