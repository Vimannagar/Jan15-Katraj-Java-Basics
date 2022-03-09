package abstractdiscussion;

public class Test1 extends Test {


	public void editInformation() {
	System.out.println("Edit information method");
		
	}

	
	public void uploadImage() {
		System.out.println("upload image method");
		
	}
	
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		t1.editInformation();
		t1.loginPage();
		t1.homePage();
	}

}
