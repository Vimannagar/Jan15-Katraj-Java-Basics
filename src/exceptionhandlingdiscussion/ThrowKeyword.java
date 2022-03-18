package exceptionhandlingdiscussion;

public class ThrowKeyword {
	
	static int i= 10;
	static int j = 20;
	
	
	public static void throwException()
	{
		if(i>j)
		{
		System.out.println("null pointer");
		throw new NullPointerException();
		}
		else
		{
			System.out.println("arithmetic");
			
			throw new ArithmeticException("throwing exception for example");
		}
		
	}
	
	public static void main(String[] args) {
		throwException();
	}

}
