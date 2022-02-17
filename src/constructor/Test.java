package constructor;

	public class Test {
		
	//	syntax of constructor
		
	//	public classname()
	//	{
	//		
	//	}
		
		public  Test()
		{
			System.out.println("constructor is executing");
			
			String s = "abc";
			
			int i = 10;
			
			System.out.println(s+i);
		}
		
		
		
		public Test(int i)
		{
			System.out.println("one argument constructor");
			
			System.out.println(i);
		}
		
		public Test(String s, double d, boolean b)
		{
			System.out.println("three argument constructor");
			
			System.out.println(s + d +b);
				
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
			
			Test t2 = new Test(50);// calling of one argument constructor
			
			
			
			Test t3 = new Test("Harris", 45.12, false);
			
		}
	
	}
