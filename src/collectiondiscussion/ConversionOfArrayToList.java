package collectiondiscussion;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionOfArrayToList {
	
	public static void main(String[] args) {
		
//		Array to ArrayList conversion
		
		String s [] = {"aaa", "bbb", "ccc"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
		
		System.out.println(al);
		
//		ArrayList to Array conversion
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		
		int length = al2.size();
		
		
		Integer  [] i = new Integer [length];
		
		
		al2.toArray(i);
		
		for(int ii:i)
		{
			System.out.println(ii);
		}
		
		
		
		
		
	}

}
