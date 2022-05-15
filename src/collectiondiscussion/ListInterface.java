package collectiondiscussion;

import java.util.ArrayList;

public class ListInterface {

	public static void main(String[] args) {

//		ArrayList al = new ArrayList();
//		
//		al.add(50);
//		al.add("abc");
//		al.add(true);
//		
//		System.out.println(al);

		ArrayList<String> al2 = new ArrayList<String>();

		al2.add("abc");
		al2.add("def");

		al2.add("ghi");
		al2.add("xyz");

		al2.remove(0);

		al2.set(1, "wxy");

		al2.add(1, "tuv");

		al2.add("tuv");

		System.out.println(al2);

		ArrayList<String> al3 = new ArrayList<String>();

		al3.add("Delhi");
		al3.add("Mumbai");
		al3.add("Kolkata");
		al3.add("Pune");

		al3.addAll(al2);

		System.out.println(al3);
// To check whether all the content of al2 is present inside the Al3 or not
		boolean ispresent = al3.containsAll(al2);

		System.out.println(ispresent);
//To remove all the contents of al2 from al3 collection we will use removeAll method
		al3.removeAll(al2);

		System.out.println(al3);
		
		String value = al3.get(1);
		
		System.out.println(value);

	}

}
