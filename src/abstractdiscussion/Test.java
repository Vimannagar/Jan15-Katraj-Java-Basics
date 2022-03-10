package abstractdiscussion;

public abstract  class Test {

	
	public Test()
	{
		System.out.println("Constructor of Test class");
	}
	
	public void loginPage()
	{
		System.out.println("Login method from Test class");
	}
	
	public void homePage()
	{
		System.out.println("home page method from Test class");
	}
	
	public abstract void editInformation();
	
	public abstract void uploadImage();
	
	
	
}
