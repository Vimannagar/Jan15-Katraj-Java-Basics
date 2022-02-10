package methodsinjava;

public class StaticMethods {
	
	public static void methodOne()
	{
		
		System.out.println("executing method one");
		
		
	}
	
	public static void methodTwo()
	{
		
		System.out.println("executing method two");
		System.out.println("Static method");
		
		
	}
	
	
	public static void main(String[] args) {
		
		methodTwo();
		methodOne();
		Test.m1();// calling of m1 method from Test class
		methodOne();
		StaticMethods.methodTwo();// calling of methodTwo from the same class
		
	}
	
	

}
