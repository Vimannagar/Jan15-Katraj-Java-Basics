package methodsinjava;

public class MethodWithNoReturnWithArgument {
	
	
	public static void uniqueCodeGenerator(String productname, int srno)
	{
		 String code = productname+srno;
		 
		 System.out.println("the unique code is "+code);
	}
	
	
	public static void main(String[] args) {
		
		
		uniqueCodeGenerator("Soap", 1);
		
	}

}
