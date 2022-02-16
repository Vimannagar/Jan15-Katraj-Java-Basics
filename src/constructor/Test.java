package constructor;

public class Test {
	
//	syntax of constructor
	
//	public classname()
//	{
//		
//	}
	
	public Test()
	{
		System.out.println("constructor is executing");
		
		String s = "abc";
		
		int i = 10;
		
		System.out.println(s+i);
	}
	
	
	
	public void m2()
	{
		
	}
	
	public static void m1() {
		System.out.println("m1 method");
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
	
		Test t1 = new Test();
		
		t.m2();
		
	}

}
