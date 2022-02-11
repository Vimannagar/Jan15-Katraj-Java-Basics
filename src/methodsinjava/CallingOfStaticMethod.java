package methodsinjava;

public class CallingOfStaticMethod {
	
	public static void m1()
	{
		System.out.println("m1 method");
	}
	
	public static void m2()
	{
		m1();// calling of static method inside another static method
		System.out.println("m2 method");
	}
	
	
	public void m3()
	{
		System.out.println("m3 non static method");
		m2();// calling of static method inside non static method
		
	}
	
	
	public void m4()
	{
		System.out.println("m4 method from calling of static method");
	}
	
	public static void main(String[] args) {
		CallingOfStaticMethod varname = new CallingOfStaticMethod();
		varname.m3();
		
	}
	

}
