package constructor;

public class A {
	
//	calling of constructor inside another construtor
	
	
	public A()
	{
		System.out.println("zero argument construtor");
	}
	
	
	public A(char c)
	{	
		this(50, "abc");
		System.out.println("one argument construtor");
		
	}

	
	public A(int i, String s)
	{
		this();
		System.out.println("two argument construtor");
		
	}
	
	public A(String s, int i)
	{
		System.out.println("two argument construtor");
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		A a1 = new A('a');
		
		
		
		
		
	}
}
