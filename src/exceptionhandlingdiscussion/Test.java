package exceptionhandlingdiscussion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
	
	public static void main(String[] args) {
		
		
		int i = 10/0;
		
		System.out.println(i);
		
		
		try {
			FileInputStream f = new FileInputStream("C://programfiles");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		catch (Exception e) {
			
		}
	}

}
