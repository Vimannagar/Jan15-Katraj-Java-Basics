package inheritance;

public class Child extends Parent{
	
	public void bike()
	{
		home();
		car();
		System.out.println("Bike method from child class");
	}
		
	
public static void main(String[] args) {
	
	Child c = new Child();
	
	c.home();
	c.bike();
	c.car();
	property();
	c.farm();
	
	Parent p = new Parent();
	p.home();
	
	
	
}
}
