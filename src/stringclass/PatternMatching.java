package stringclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
	
	public static void main(String[] args) {
		String s = "abcdefabcdefghiabcdef";
		int count =0;
		Pattern pat = Pattern.compile("def");
		
		
		
		Matcher mat = pat.matcher(s);
		
		
		while(mat.find())
		{
			count++;
		}
		
		
		System.out.println(count);
		
		
		
		
	}

}
