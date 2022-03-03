package accessmodifiers;

public class ACTest2 {
	
	public static void main(String[] args) {
		ACTest1 am = new ACTest1();
		ACTest1.m1();
		
		ACTest3 t3 = new ACTest3();
		
		
		
	}
	
	private static void m4()
	{
		System.out.println("m4 private method");
	}

}
