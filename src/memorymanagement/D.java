package memorymanagement;

public class D extends E
{
	public void m10()
	{
		a.m1();
		b.m5();
		c.m9();
		
	}
	
	public void m11()
	{
		b.m6();
		a.m1();
	
	}
	
	public void m12()
	{
		a.m1();
		c.m9();
	}
	
	
	public static void main(String[] args) {
		D d = new D();
		
		d.m10();
		
		d.m11();
		d.m12();
		
	}

}
