package abstractdiscussion;

public class Test2 extends Test1 {

	
	public void uploadImage() {
		System.out.println("upload image provided by Test 2 class");
		
	}
	
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		
		t2.editInformation();
		t2.loginPage();
		t2.homePage();
		
		t2.uploadImage();
	}
	
	

}
