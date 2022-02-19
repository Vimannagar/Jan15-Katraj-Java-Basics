package operators;

public class ConditionalOperator {
	
	public static void main(String[] args) {
		
//		greater than operator'>'
		
		
		int i = 100;
		int j = 20;
		
	boolean	r = i>j;
	
	System.out.println(r);
	
	
	if(i>j)
	{
		System.out.println("if is executing ");
	}
	else
	{
		System.out.println("else is executing");
	}
	
//	greater than or equal to '>='
	
	boolean s = i>=j;
	
	System.out.println(s);
	
	
//	less than '<'
	
	 boolean t = i<j;
	 
	 System.out.println(t);//false
	 
	 
//		less than or equal to '<='
	 
	boolean v =  i<=100;
	
	
	System.out.println(v);// true
	
	
//	equal to operator '==' 
	
boolean w = i==j;

System.out.println(w);// false

if(i==j)
{
	System.out.println("if is executing ");
}

else
{
	System.out.println("else is executing");
}
	
	
	
	}

}
