package accessmodifiers;

 public class ACTest1 {
	
	
//	public access modifier for method
	public static void m1()
	{
		System.out.println("m1 method");
	}

	// default access modifier method
	 void m2()
	{
		System.out.println("m2 method from ACTest1 class");
	}
	 
//	private access modifier method
	 
	 private static void m3()
	 {
		 System.out.println("m3 private method from ACTest1 class");
	 }
	 
	 public static void main(String[] args) {
		
		 m3();
		 
	}
	
	
}
