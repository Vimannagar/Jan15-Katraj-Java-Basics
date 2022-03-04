package revision;

import accessmodifiers.A;
import accessmodifiers.ACTest1;
import accessmodifiers.VariableAccessModifier;

public class AccessTest {
	
	public static void main(String[] args) {
		
		
		ACTest1  t2 = new ACTest1();
		
		
		ACTest1.m1();// accessing public method from other package
		
		
//		t2.m2();
		VariableAccessModifier vam = new VariableAccessModifier();
			System.out.println(vam.i);
			
//			VariableAccessModifier.s; s is default so it is not accessible
		
	}

}
