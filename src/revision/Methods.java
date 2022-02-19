package revision;

public class Methods {
	
//	main method 
//	Regular method
//	Static method and Non static method
	
	// Static method:
	
	public static void m1()
	{
		System.out.println("Static method m1");
		
	}
	
	public static void m2()
	{
		System.out.println("Static method m2");
//		calling static method
		m1();
		Methods.m1();
		
//		calling non static method
		Methods m = new Methods();
		m.m3();
		
	}
	
	public void m4()
	{
		System.out.println("m4 method non static");
	}
	
	public void m3()
	{
		System.out.println("non static m3 method");
		
//		calling a static method
		m1();
		Methods.m1();
		
//		calling non static method
		m4();
		
	}
	

}
