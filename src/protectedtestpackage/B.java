package protectedtestpackage;

import accessmodifiers.A;

public class B extends A
{
	
	public static void main(String[] args) {
		
		B b= new B();
		
		b.m1();
		
		A a = new A();
		a.m1();
		
	}

}
