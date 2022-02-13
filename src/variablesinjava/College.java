package variablesinjava;

public class College {
	
	
	String name ;
	
	static String collegename;
	
	int mathsmarks;
	
	int age;
	
	static String collegecity;
	
	String nativeplace;
	
	public static void main(String[] args) {
		
		College s1 = new College();
		
		s1.name= "Daniel";
		s1.mathsmarks = 50;
		s1.age = 18;
		s1.nativeplace = "Alaska";
		
		collegecity = "Boston";
		
		collegename = "ABC";
		
		College s2 = new College();
		
		s2.name= "Eder";
		s2.mathsmarks = 60;
		s2.age = 19;
		s2.nativeplace = "Mexico";
		
		
		
		System.out.println(s2.mathsmarks);
		
		
	}
	
	
	
	
	

}
