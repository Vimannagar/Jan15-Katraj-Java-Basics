package collectiondiscussion;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountDuplicateCharacter {
	
	public static void main(String[] args) {
		String s = "abcdefabcdddfff";
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		
		
		for(int i=0; i<s.length(); i++ )
		{
			char charvalue = s.charAt(i);
			
			if(hm.containsKey(charvalue))
			{
				hm.put(charvalue, hm.get(charvalue)+1);
			}
			
			else
			{
				hm.put(charvalue, 1);
			}
		}
		
		System.out.println(hm);
		
		 Set<Entry<Character, Integer>> keyvalue = hm.entrySet();
		 
		 for(Entry<Character, Integer> kv:keyvalue)
		 {
			 System.out.print(kv.getKey()+" "+kv.getValue());
		 }
		 
		
	}

}
