package methodsinjava;

public class MethodWithReturnNoArgument {
	
	static int currentroll = 0; 
	
	String name;
	int rollnumber;
	public double substraction()
	{
		double d = 56;
		
		double e = 3.5689;
		
		double f = d-e;
		
		
		System.out.println("substracted value is "+f);
		return f;
		
		
		
		
	}
	
	public int autoRollIncrementer()
	{
		currentroll = currentroll +1;
		
		
		return currentroll;
	}
	
	
	
	
	public static void main(String[] args) {
		
		MethodWithReturnNoArgument t = new MethodWithReturnNoArgument();
		
		double y = t.substraction();
		
		double g = y+5;
		
		System.out.println(g);
		
		
		
		MethodWithReturnNoArgument t1 = new MethodWithReturnNoArgument();
		
		t1.name = "Ramesh";
		t1.rollnumber = t1.autoRollIncrementer();
		
		MethodWithReturnNoArgument t2 = new MethodWithReturnNoArgument();
		
		t2.name = "Harris";
		
		t2.rollnumber = t2.autoRollIncrementer();
		
		System.out.println(t1.rollnumber);
		System.out.println(t2.rollnumber);
	}

}
