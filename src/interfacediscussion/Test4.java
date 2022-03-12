package interfacediscussion;

public class Test4 extends Test3 implements Interface1, Interface2 {
	
	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.m1();
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendKeys(String s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}
	
//	A extends B implements C--> A is class B is Class C is interface
	
//	A implements B, C- A- class, B and C - Interface
	
//	A extends B, C- A, B and C--> interface

}
