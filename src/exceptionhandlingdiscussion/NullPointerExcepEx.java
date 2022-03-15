package exceptionhandlingdiscussion;

public class NullPointerExcepEx {
	static NullPointerExcepEx npe;
	
	public void m1()
	{
		System.out.println("m1 method is executing");
	}
	
	
	
	public static void main(String[] args) {
		
			try {
			npe.m1();
			
			}
			
			catch(NullPointerException e)
			{
				System.out.println("null pointer exception arrived");
			}
			
			catch (ArrayIndexOutOfBoundsException e) {
				
			}
			
			System.out.println("After catch block");
		}
		

}
