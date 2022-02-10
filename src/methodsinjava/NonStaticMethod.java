package methodsinjava;

public class NonStaticMethod {
	
//	syntax:
//	access_modifier return_type name_of_method ()
//	{
//		
//	}
	
	public void m1()
	{
		System.out.println("non static m1 method");
	}
	
	public void m2()
	{
		System.out.println("non static m2 method");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
//		object syntax:
//		classname variablename = new classname();
		
		NonStaticMethod p = new NonStaticMethod();
		
		p.m1();
		
		
		p.m2();
		
		NonStaticMethod varname = new NonStaticMethod();
		
		varname.m2();
		varname.m1();
		
		
		Test2 t2 = new Test2();
		
		t2.addition();
		
			
		
		
		
		
		
		
	}
	
	

}
