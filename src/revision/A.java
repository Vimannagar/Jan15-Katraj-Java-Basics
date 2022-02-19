package revision;

public class A {
	
	int i = 50;
	int j = 20;
	
	static int k = 90;
	
	
	public static void main(String[] args) {
		A a1 = new A();
		
		a1.i= 10;
		
		A a2 = new A();
		
		a2.i= 60;
		a2.j= 70;
		
		System.out.println(a1.j);//20
		
		System.out.println(a2.j);//70
		System.out.println(k);//90
		a2.k= 50;
		
		System.out.println(k);//50
		
//		output
//		20
//		70
//		90
//		50
		
	}

}
