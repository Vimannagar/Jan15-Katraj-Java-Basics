package exceptionhandlingdiscussion;

public class ErrorExample {
	
	public void m1()
	{
		System.out.println("m1 method ");
		m2();
	}
	
	public void m2()
	{
		System.out.println("m1 method ");
		
		m1();
	}
	
	public static void main(String[] args) {
		
		ErrorExample ee = new ErrorExample();
		ee.m1();
		
	}

}
