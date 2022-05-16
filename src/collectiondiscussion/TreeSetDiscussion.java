package collectiondiscussion;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetDiscussion {
	
	public static void main(String[] args) {
		

		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("46445");
		ts.add("Delhi");
		ts.add("Kolkata");
		ts.add("Mumbai");
		ts.add("Pune");
		ts.add("Bengaluru");
		ts.add("Pune");
		
		System.out.println(ts);
		
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		
		ts1.add(56);
		ts1.add(0);
		ts1.add(90);
		ts1.add(78);
		
		System.out.println(ts1);
		
		
		TreeSet<String> ts2 = new TreeSet<String>(new MyComp());
		
		ts2.add("46445");
		ts2.add("Delhi");
		ts2.add("Kolkata");
		ts2.add("Mumbai");
		ts2.add("Pune");
		ts2.add("Bengaluru");
		ts2.add("Pune");
		
		System.out.println(ts2);
		
		
		
	}

}
