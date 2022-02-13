package variablesinjava;

public class NonStaticVariables {
	
	
//	Syntax:
//	datatype variable_name = value;
	
	int i = 50;
	
	String s = "abc";
	
	static int k = 30;
	
	
	
	
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
	
	System.out.println(k);//30
	
	System.out.println(nsv.k);//30
	
	System.out.println(nsv1.k);//30
	
	nsv.k = 40;
	
	System.out.println(nsv1.k);//40
	
	k= 80;
	
	System.out.println(nsv1.k);//80
	
	System.out.println(nsv.k);//80
		
		
	}
	

}
