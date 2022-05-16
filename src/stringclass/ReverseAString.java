package stringclass;

public class ReverseAString {
	
	
	public static void main(String[] args) {
		String s = "sdfjkdshfjs";
		
		String reverse = "";
		int size = s.length();
		
		for(int i=(size-1); i>=0; i--)
		{
			char c = s.charAt(i);
			
			reverse = reverse + c;
		}
		
		System.out.println(reverse);
		
	}

}
