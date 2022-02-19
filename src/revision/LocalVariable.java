package revision;

public class LocalVariable {
	
	int j = 10;
	
	static int i = 100;
	
	static int l = 55;
	
	int k = 45;
	
	public static void main(String[] args) {
		
		int i = 20;
		
		System.out.println(LocalVariable.i);
		
		int j = 50;
		
		if(true)
		{
			int k = 50;
		}
		
		System.out.println(l);
		
		LocalVariable lv = new LocalVariable();
		lv.m1();
		
	}
	
	public  void m1()
	{
		int j = 5;
		
		System.out.println(j);
		
		System.out.println(k);
		
		System.out.println(this.j);
		
		System.out.println(this.i);
		
		System.out.println(l);
		
	}
	
//Output:
//	100
//	55
//	5
//	45
//	10
//	100
//	55

}
