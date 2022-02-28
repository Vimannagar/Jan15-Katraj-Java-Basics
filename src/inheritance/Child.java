package inheritance;

public class Child extends Parent{
	
	String s = "child class variable";
	
	static String j = "static variable";
	
	public void bike()
	{
		home();
		car();
		System.out.println("Bike method from child class");
		
		System.out.println(s);// accessing non static variable from child class
		System.out.println(this.s);// accessing non static variable from child class
		System.out.println(j);// accessing static variable from Parent class
		System.out.println(super.s);// accessing non static variable from parent class
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
	
	
	System.out.println(c.s);// child class s variable
	
	System.out.println(j);// child class j variable
	
	System.out.println(p.s);// parent class s variable
	
	System.out.println(Parent.j);// parent class j variable
	
	
	
	
	
}


}
