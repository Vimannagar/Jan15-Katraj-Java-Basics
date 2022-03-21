package casting;

public class Child extends Parent{
	
	public void m1()
	{
		System.out.println("m1 method of child class" );
	}
	
	public static void main(String[] args) {
		
		Child c  =  new Child();
		
		Parent d = (Parent)c;// UP casting
		
		d.m1();// child class
		
		d.m2();//parent class
		
		Parent p = new Parent();
		
//		Child cc = (Child)p;// Down casting
//		
//		cc.m1();
		
		Child g = (Child)d;// Down Casting
	
		g.m1();
	
		
	}

}
