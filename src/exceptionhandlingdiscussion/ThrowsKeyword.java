package exceptionhandlingdiscussion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException, ArithmeticException
	{
		
		
		System.out.println("first line");
		
		FileInputStream fis = new FileInputStream("E:\\desktop\\Kfsfsdfatraj\\15 Jan\\Constructor.docx");
		
		
		
		System.out.println("LAst line");
		
	}

}
