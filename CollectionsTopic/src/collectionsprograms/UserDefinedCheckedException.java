package collectionsprograms;

class ChildMarriageException extends Exception
{
	String msg;
	
	ChildMarriageException(String msg)
	{
		this.msg=msg;
	}
	String getMessage1()
	{
		return msg;	
	}
}
public class UserDefinedCheckedException {

	static void shaadidotcom() throws ChildMarriageException
	{
		int age = 28;
		if(age>=21)
		{
			System.out.println("Happy Married Life");
		}
		else{
			throw new ChildMarriageException("Invalid Age");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("******** Main Starts ********");
		try{
			shaadidotcom();
		}
		catch(ChildMarriageException e){
			System.out.println(e.getMessage1());
		}
		System.out.println("******** Main Ends ********");
	}

}
