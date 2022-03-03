package accessmodifiers;

 final class Test extends ACTest2 {

	public void m1()
	{
		System.out.println("m1 method is executing");
	}
	
	public static void main(String[] args) {
		
		ACTest1.m1();
		
		ACTest1 t1 = new ACTest1();
		
		t1.m2();
		
//		ACTest1.m3();
		
		A a = new A();
		a.m1();
		
		
	}
	
	
}
