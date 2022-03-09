package polymorphism;

public class Child1 extends Parent1 {
	
	
	public void bike()
	{
		System.out.println("Bike method from child class");
		
	}	
	
//	public void marry()
//	{
//		System.out.println("Child class marry method");
//	}
//	
	
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.car();
		c.home();
	}
	
	
	
}
