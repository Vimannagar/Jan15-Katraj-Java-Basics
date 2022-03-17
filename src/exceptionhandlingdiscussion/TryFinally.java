package exceptionhandlingdiscussion;

public class TryFinally {
	
	public static void main(String[] args) {
		
		
		try {
			System.out.println("inside the try block");
			int i=10;
			int j = 0;
			int k = i /j;
		}
		
		finally
		{
			System.out.println("finally block");
		}
	}

}
