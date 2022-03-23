package stringclass;

public class BasicConcept {
	
	
	
	public static void main(String[] args) {
		
		String s = new String("abc");
		
		String s1 =  new String("def");
		
		String ss = "jkl";
		
		String ss1 = "jkl";
		
		String s2 =  new String("jkl");
		
		String s3 = new String("abc");
		
		String ss2 = "abc";
		
		
	boolean ispointingsame = ss==ss1;
	System.out.println(ispointingsame);//true
	
	
	boolean ispointsameobj = ss==s2;
	
	System.out.println(ispointsameobj);//false
		
	
	
	boolean isequal = s3.equals(s);
	
	System.out.println(isequal);//true
	
	
	boolean isequal2 = ss.equals(s2);
	System.out.println(isequal2);// true
	
	
	
	String var1 = "Velocity";
	
	
	var1.concat(" Corporate");

	
	System.out.println("Output of String is "+var1);// Velocity--> Immutable
	
	
	System.out.println("*********************************");
	
	StringBuffer sb = new StringBuffer("Velocity");
	
	sb.append(" Corporate");
	
	System.out.println("Output of String Buffer is "+sb);// Velocity Corporate ---> Mutable
	
	
		
	}
}
