package collectiondiscussion;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {
	
	public static void main(String[] args) {
		Integer i [] = new Integer[5];
		
		i[0]= 10;
		i[1]= 20;
		i[2]= 20;
		i[3]= 30;
		i[4]= 40;
		
		for(int ii:i)
		{
			System.out.println(ii);
		}
		
HashSet<Integer> hs = new HashSet<Integer>(Arrays.asList(i));

System.out.println(hs);

Integer i1 [] = new Integer[5];

i1[0]= 90;
i1[1]= 20;
i1[2]= 20;
i1[3]= 10;
i1[4]= 40;


Arrays.sort(i1);

for(int ii:i1)
{
	System.out.println(ii);
}


		
		
	}

}
