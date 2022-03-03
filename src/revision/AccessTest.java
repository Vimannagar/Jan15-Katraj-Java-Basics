package revision;

import accessmodifiers.ACTest1;

public class AccessTest {
	
	public static void main(String[] args) {
		
		
		ACTest1  t2 = new ACTest1();
		
		
		ACTest1.m1();// accessing public method from other package
		
		
		t2.m2();
		
		
	}

}
