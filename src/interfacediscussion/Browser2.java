package interfacediscussion;

public class Browser2 implements Interface1 {

	
	public void close() {
		System.out.println("close method of browser 2");
		
	}

	
	public void back() {
		
		System.out.println("back method of browser 2");
	}

	
	public void refresh() {
		
		System.out.println("refresh method of browser 2");
	}


	@Override
	public void sendKeys(String s) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		
	}
	
	

}
