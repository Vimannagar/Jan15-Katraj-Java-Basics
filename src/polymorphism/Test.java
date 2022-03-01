package polymorphism;

public class Test {
		
	public void m1(String s)
	{
		System.out.println("String argument method");
	}
	
	public void m1()
	{
		System.out.println("no argument method");
	}
	
	public static void m1(boolean b)
		{
			System.out.println("Boolean argument method");
		}
		
	public int m1(double d)
		{
			System.out.println("m1 method with int return type");
			
			return 50;
		}
		
	
	public void nameChange(String name, int Documentid)
	{
		System.out.println("name has been updated");
		
	}

	public void nameChange(String name, int Documentid, String marriagecert)
	{
		System.out.println("name has been updated as per certificate");
	}
	
	
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m1("abc");
		
		t.nameChange("Robin", 50);
		
		t.nameChange("Hariet", 25, "Hariet Johnson");
	}
}
