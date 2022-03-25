package arraydiscussion;

public class ArrayDefination {

	
	public static void main(String[] args) {
		
//		1st way to define an array:
		
			int [] a = new int [5];
			
			a[0] = 10;
			a[1] = 21;
			a[2] = 2;
			a[3] = 60;
			a[4] = 60;
		
	
		
		
		System.out.println(a[2]);
	
		
		for(int i=0; i<5; i++)
		{
			System.out.println(a[i]);
		}
		
		
		
//		advance for loop or for each loop
		
		
		for(int t:a)
		{
			System.out.println(t);
		}
		System.out.println("****************************************");
		
		String [] str = new String [3];
		
		str[0] = "a1";
		str[1] = "a2";
		str[2] = "a3";
		
		
		for(String h:str)
		{
			if(h.equals("a2"))
			{
				h= h+34;
				System.out.println(h);
			}
		}
		
		
//	WAP to print the values of even index position of an Array
		
//	WAP to print the values of an array which are even	
		
//	WAP to add the all the elements of an array	
		
		
	}
}
