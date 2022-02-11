package methodsinjava;

public class CallingOfNonStaticMethod {
	
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	public static void m2()
	{
		CallingOfNonStaticMethod refname = new CallingOfNonStaticMethod();
		refname.m1();// Calling of non static method inside static method
		
	}
	
	public static void main(String[] args) {
		
		CallingOfNonStaticMethod var = new CallingOfNonStaticMethod();
		var.m1();
		var.m3();
		
		
		
	}
	
	public void m3()
	{
		m1();// calling of non static method which is in the same class
		CallingOfStaticMethod cosm = new CallingOfStaticMethod();
		cosm.m4();// calling of non static method which is in another class
		
		
	}

}
