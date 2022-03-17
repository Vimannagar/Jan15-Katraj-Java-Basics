package exceptionhandlingdiscussion;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		
		
		try {
		int i=10;
		int j = 2;
		int k = i /j;
		}
		
		catch(ArithmeticException e)
		{
			String message = e.getMessage();
			
			System.out.println(message);
			System.out.println("Arithmetic exception block");
		}
		
		finally
		{
			System.out.println("finally block");
		}
		
		
//	final finally and finalize()	
		
		
	}

}
