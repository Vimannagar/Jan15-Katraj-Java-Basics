


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
	
	
	
//	16. ValueOf(primitive data type)
	
	int val = 100;
	String stringvalue = String.valueOf(val);
	
	System.out.println(stringvalue+55);//10055
	
	}
	

}
