package revision;

public class Variables {
	
//	3 types of variables:
//	1. static variable
//	2. non static variable 3. local variable
	
//	static variable
	static int i ;// declaration
	
	static int j = 60;
	
	String k = "abc";

	
	
	public static void main(String[] args) {
		i=50;// initialization
		
		System.out.println(i);// utilization
		
		System.out.println(Variables.i);
		
		Variables v = new Variables();
		
		System.out.println(v.k);
		
		System.out.println("************************************");
		
		v.m1();
		
		
		
		
	}
	
	public void m1()
	{
		System.out.println(Variables.i);
		System.out.println(k);
		
		Variables2 v2 = new Variables2();
		
		System.out.println(v2.k);
		
		
	}
	

}
