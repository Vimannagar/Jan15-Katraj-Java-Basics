


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
	
	char s10 = s9.charAt(1);
	
	System.out.println(s10);//b
	
	
//	WAP to print reverse of a String value
	
	String s11 = "This is String";
	
	String rev = "";
	
	int size = s11.length();
	
	int lastindex = size-1;
	
	for (int i=lastindex; i>=0; i--)
	{
		rev = rev + s11.charAt(i);
	}
	
	System.out.println(rev);
	
	
	
	
	
//	WAP to print the horizontal String to the vertical individual character
	
	String s12 = "Velocityhkjhfdkjshfkjsdfhkjsdfhksdjfhsdkfhsdkjfhsdkjfk";
	
	for(int i=0; i<s12.length(); i++  )
	{
		char letter = s12.charAt(i);
		
		System.out.println(letter);
	}
	
//	5. replace(char old, char new)
	
	String s13 = "abcdef";
	
	String s14 = s13.replace('b', 'f');
	
	System.out.println(s14);//afcdef
	
	
//	6. replace(String old, String new)
	
	String s15 = "Constructor";
	
	String s16 = s15.replace("truc", "tor");
	
	System.out.println(s16);//Constortor
	
	
//	7. substring(int index):
	
	String s17 = "Velocity";
	
	String s18 = s17.substring(3);
	
	System.out.println(s18);//ocity
	
//	8. substring(int beginindex, int endindex)
	
	String s19 = "Corporate";
	
	String s20 = s19.substring(2, 7);
	
	System.out.println(s20);//rpora
	
	
//	9. contains(String value)
	
	String s21 = "abcdefghijklk";
	
	boolean s22 = s21.contains("lk");
	
	System.out.println(s22);//true
	
	
//	10. toLowerCase()
	
	String s23 = "VELOciTy";
	
	String s24 = s23.toLowerCase();
	
	System.out.println(s24);//velocity
	
	
	
//	11. toUpperCase()
	
	String s25 = s24.toUpperCase();
	
	System.out.println(s25);
	
	
//	12. indexOf(char ch)
	
	String s26= "abcdefabc";
	
	int s27 = s26.indexOf('b');
	
	System.out.println(s27);//1
	
		
//	WAP to count a character in a String 
	
	
	String s28 = "aabbaaccd";
	int count =0;
	
	for(int i=0; i<s28.length(); i++)
	{
		char c = s28.charAt(i);
		
		if(c=='a')
		{
			count++;
		}
		
	}
	
	System.out.println("Character a is present for "+count+" times");
	
	
//	13. trim()
	
	String s29 = "     Happy new year     ";
	
	String s30 = s29.trim();
	System.out.println(s30);//Happy new year
	
	
// WAP to check a String is palindrome or not	
		String s31 = "xerex";
	
		
// 14. split(String s)
		
	String s32 = "This is String";
		
	String[] s33 = s32.split("i");
	
	for(String ss:s33)
	{
		System.out.println(ss);
	}
	
//	WAP to print  the reverse string without reversing the letters but the words
//	ex. This is String ----> String is This 
	
	
	
//	15. toCharArray():
	
	String s34 = "String Value #123";
	
	char[] chararray = s34.toCharArray();
	
	int sizee = chararray.length;
	for(int ii= 0; ii<sizee; ii++)
	{
		System.out.println(chararray[ii]);
	}
	
	
	
//	16. valueOf(primitive data type)
	
	int val = 100;
	String stringvalue = String.valueOf(val);
	
	System.out.println(stringvalue+55);//10055
	
	
	boolean bol = false;
	
	
	String s35 = String.valueOf(bol);
	
	System.out.println(s35);//false
	
	
//	conversion of String to primitve data type:
//	17. parseXxx()
	String s36 = "10";
	
	int s37 =Integer.parseInt(s36);
	
	int addedvalue = s37+2;
	System.out.println(addedvalue);//12
	
	String s39 = "56.23";
	
	double s40 = Double.parseDouble(s39);
	
	System.out.println(s40);//56.23
	
	String s41 = "true";
	
	boolean s42 = Boolean.parseBoolean(s41);
	
	System.out.println(s42);
	
	
//	18. isDigit(char c)
	
	char s43 = '8';
	
	boolean s44 = Character.isDigit(s43);
	
	System.out.println(s44);//true
	
//	19. isAlphabetic(char ch);
	
	char s45 = 'g';
	
	boolean s46 = Character.isAlphabetic(s45);
	
	System.out.println(s46);//true
	
	
//	WAP to print to take out the number and Alphabet from a String
	String s47 = "sdfdsf234sdlkfj3fndslk3e3fnc";
	
	
	
//	20 replaceAll(String str):
	
	String s48 = "A@@c3c4e32%#nt324ure";
	
	String s49 = s48.replaceAll("[a-z]", ".");
	
	System.out.println(s49);//A@@.34.32%#..324...
	
	String s51 = s48.replaceAll("[a-c]", ".");
	
	System.out.println(s51);//A@@.34e32%#nt324ure
	
	String s52 = s48.replaceAll("[A-Za-z]", "0");
	
	System.out.println(s52);//0@@034032%#00324000
	
	String s53 = s48.replaceAll("[^a-z]", "1");
	System.out.println(s53);//111c11e1111nt111ure
	
	String s54 = s48.replaceAll("[^a-zA-Z]", "");
	System.out.println(s54);//Accenture
	
	String s55 = s48.replaceAll("[0-9]", "k");
	System.out.println(s55);//A@@ckckekk%#ntkkkure
	
	}
	
	
	

}
