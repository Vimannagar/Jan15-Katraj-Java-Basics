package interfacediscussion;

public class Browser1 implements Interface1 {

	
	public void close() {
		System.out.println("close method of browser 1");
		
	}

	
	public void back() {
		
		System.out.println("back method of browser 1");
	}

	
	public void refresh() {
		
		System.out.println("refresh method of browser 1");
	}
	
	
	public static void main(String[] args) {
		Interface1 b1 = new Browser1();
		b1.close();
		
		Interface1.m1();
		
	}


	
	public void sendKeys(String s) {
		
		
	}



	public void sendKeys() {
		
		
	}
	

}
