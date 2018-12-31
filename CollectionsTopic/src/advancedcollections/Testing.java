package advancedcollections;

public class Testing {

	static int add(int a)
	{
		a=a+1;
		for (int i = 0; i < 10; i++) {
			int c = add(12);
		}
		return a;
	}
	public static void main(String[] args) {
		
		int b = add(12);
		System.err.println(b);

	}

}
