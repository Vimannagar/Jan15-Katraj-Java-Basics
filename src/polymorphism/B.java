package polymorphism;

public class B extends A{
	String s = "def";
	
	public void m2()
	{
		System.out.println("m2 method from B class");
	}
	
	public void m3()
	{
		System.out.println("m3 method from B class");
	}
	
	public void m6(int i)
	{
		System.out.println("m6 method A class one arg");
	}
	
	public static void m5()
	{
		System.out.println("static method m5 from Class B");
	}
	
	public static void main(String[] args) {
		B b =  new B();
		b.m2();// B class m2 method
		b.m1();// A class m1 method
//		calling static method
		b.m5();// B class static method
		
		System.out.println(b.s);// def
		b.m6(0);
		
		A a =  new A();
		a.m2();// A class m2 method
		a.m5();//A class Static method
		System.out.println(a.s);//abc
		
		a.m6();// A class
		
		A aa = new B();
		
		aa.m2();//B class m2 method
		aa.m4();// A class method
		
		aa.m5();// A class static method
		System.out.println(aa.s);//abc
		
		aa.m6();// A class
	
		
		
		
	}
}
