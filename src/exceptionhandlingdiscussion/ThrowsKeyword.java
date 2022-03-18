package exceptionhandlingdiscussion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
	Test t;
	public static void main(String[] args) throws  FileNotFoundException, InterruptedException, ArithmeticException, NullPointerException
	{
		
		
		System.out.println("first line");
		
//		FileInputStream fis = new FileInputStream("E:\\desktop\\Kfsfsdfatraj\\15 Jan\\Constructor.docx");
				
		System.out.println("LAst line");
		
		ThrowsKeyword tk = new ThrowsKeyword();
		
		tk.m2();// Null pointer exception because we have only reference variable but not object
		
		
		
	}
	
	public void m2() throws NullPointerException
	{
		t.m1();
	}

}
