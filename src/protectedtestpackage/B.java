package protectedtestpackage;

import accessmodifiers.A;

public class B extends A
{
	
	public static void main(String[] args) {
		
		B b= new B();
		
		b.m1();
		
		A a = new A();
//		a.m1();// we cannot access this method by A reference variable as it is protected which can only be access by reference variable of child class outside the package.
		
		System.out.println(b.j);
		
		A.m2();
		
	}

}
