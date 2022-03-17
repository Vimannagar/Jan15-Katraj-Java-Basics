package exceptionhandlingdiscussion;

public class Test2 {
	
	public static void main(String[] args) {
		
		System.out.println("First line");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Catch block");
			
		}
			
		System.out.println("last line");
		
	}
	

}
