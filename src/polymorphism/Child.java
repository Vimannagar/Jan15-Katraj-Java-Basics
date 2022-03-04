package polymorphism;

public class Child  extends Parent{
	public void bike()
	{
		System.out.println("Bike method from child class");
		
	}	
	
	public void marry()
	{
		System.out.println("Child class marry method");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.marry();// child class marry method
		c.car();
		
		Parent p = new Parent();
		p.marry();// parent class marry method 
	}
}
