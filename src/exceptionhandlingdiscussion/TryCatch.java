package exceptionhandlingdiscussion;

public class TryCatch {

	public static void main(String[] args) {
		int k;
		
		try {
		
		int i = 10;
		int j = 0;

		 k = i / j;
		 
		 
		
		System.out.println(k);
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arithmetic catch is excuting");
		}
		catch(NullPointerException q)
		{
			System.out.println("Null pointer exception has arrived");
		}
		catch (ClassCastException c) {
			
		}
		catch(Exception w)
		{
			System.out.println("Exception block ");
		}
		catch(Throwable e)
		{
			System.out.println("Throwable block ");
		}
		
		
		System.out.println("After the exception handling");
		

	}

}
