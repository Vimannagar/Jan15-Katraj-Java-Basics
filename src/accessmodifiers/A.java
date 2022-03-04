package accessmodifiers;

public class A {
	
	protected void m1()
	{
		System.out.println("protected m1 method from A class");
	}
	
	protected static void m2()
	{
		System.out.println("protected static method A class");
	}
	
	protected int j = 50;

	
	public static void main(String[] args) {
//		System.out.println(VariableAccessModifier.c); c is private hence it will not be acessible here
		
		A a = new A();
		System.out.println(a.j);
		
		m2();
		
	}
}
