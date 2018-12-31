package advancedcollections;

public class Student extends Person{
	double marks;
	public Student(String name, int age, double marks) {
		super(name, age);
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + ", age=" + age + "]";
	}
}
