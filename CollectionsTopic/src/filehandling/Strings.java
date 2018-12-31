package filehandling;

public class Strings {

	public static String concat1(String s1) 
    { 
        s1 = s1+"forgeeks";
        System.out.println(s1);
		return s1;
    } 
	public static void main(String[] args) {
		
		String s1=new String("geeks");
		s1=concat1(s1);
		System.out.println(s1);

	}

}