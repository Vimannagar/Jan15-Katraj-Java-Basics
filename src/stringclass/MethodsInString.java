package stringclass;

public class MethodsInString {
	
	public static void main(String[] args) {
//		1. equals(String s)
		
		String s1 = "Velocity";
		String s2 = "velocity";
		
	boolean s3 = s1.equals(s2);
	
	System.out.println(s3);//false
	
//	2. equalsIgnoreCase(String s)
	
	String s4 = "Velocity";
	String s5 = "velOcity";
	
	boolean s6 = s4.equalsIgnoreCase(s5);
	
	System.out.println(s6);//true
	
//	3. length();
	
	String s7 = "abcdefghi";
	
	int s8 = s7.length();
	
	System.out.println(s8);//9
	
//	4. charAt(int index);
	
	String s9 = "abcdef";
	
	char s10 = s9.charAt(10);
	
	System.out.println(s10);//b
	
	
//	WAP to print reverse of a String value
	
//	WAP to print the horizontal String to the vertical individual character
	
	
		
		
		
	}
	

}
