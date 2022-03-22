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
	System.out.println(ispointingsame);
	
	
	boolean ispointsameobj = ss==s2;
	
	System.out.println(ispointsameobj);
		
		
		
	}
}
