package variablesinjava;

public class NonStaticVariables {
	
	
//	Syntax:
//	datatype variable_name = value;
	
	int i = 50;
	
	String s = "abc";
	
	
	
	
	public static void main(String[] args) {
		
		NonStaticVariables nsv =new NonStaticVariables();
		 
		
		System.out.println(nsv.i);//50
		
		
		nsv.i = 10;
		
		
		NonStaticVariables nsv1 = new NonStaticVariables();
		
		nsv1.i = 20;
		
		System.out.println(nsv.i);//10
		
		System.out.println(nsv1.i);//20
		
	nsv.s = nsv.s + "def";
	
	System.out.println(nsv.s);//abcdef
		
		
	}
	

}
