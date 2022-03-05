package polymorphism;

public class B extends A{
	public void m2()
	{
		System.out.println("m2 method from B class");
	}
	
	public void m3()
	{
		System.out.println("m3 method from B class");
	}
	
	
	public static void main(String[] args) {
		B b =  new B();
		b.m2();// B class m2 method
		b.m1();// A class m1 method
		
		
		A a =  new A();
		a.m2();// A class m2 method
		
		A aa = new B();
		
		aa.m2();// B class method
		aa.m4();// A class method
		
		
	}
}
