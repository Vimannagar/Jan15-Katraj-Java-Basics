package variablesinjava;

public class ThisKeyword {

	static int i = 50;
	
	int k= 60;
	
	
	public static void main(String[] args) {
		
		
		int i = 10;
		
		String l = "abc";
		
		System.out.println(i);//local - 10
		
		
		
		System.out.println(ThisKeyword.i);//50
		
		
		ThisKeyword tk = new ThisKeyword();
		tk.m1();
		
		ThisKeyword.m2();
		
	}
	
	public void m1()
	{
		int k =80;
		
		System.out.println(k);//80
		
		System.out.println(this.k);//60
	}
	
	public static void m2()
	{
	int k =80;
	System.out.println(k);//80
	ThisKeyword tk = new ThisKeyword();
	System.out.println(tk.k);//60
		
	}
}
