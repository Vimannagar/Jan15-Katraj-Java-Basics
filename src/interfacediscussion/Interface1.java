package interfacediscussion;

public interface Interface1 {
	
	int i = 50;
	void close(); 
	
	public abstract void back();
	
	public void refresh();
	
	public void sendKeys(String s);
	
	public void sendKeys();
	
//	all the above methods are having the same category i.e public and abstract.
	
	 static void m1()
	{
		System.out.println("M1 static method");
	}
	
	
	public static void main(String[] args) {
		
		m1();
		Interface1.m1();
		
	}
	
	
	

}
