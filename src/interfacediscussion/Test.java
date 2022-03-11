package interfacediscussion;

public class Test {
	
	public static void main(String[] args) {
		
		Browser2 b1 = new Browser2();
		b1.back();
		b1.close();
		b1.refresh();
		
		Interface1 i1 = new Browser1();
		
		i1.back();
	}

}
