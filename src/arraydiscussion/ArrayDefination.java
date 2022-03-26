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
		
		System.out.println("******************************************");
		
		String s1[] =new String[5];
		
		s1[0]= "abc";
		s1[1] = "def";
		s1[2] = "ghi";
		s1[3] = "klm";
		s1[4]= "nop";
		
		for(int i=0; i<5; i++)
		{
			if(i%2==0)
			{
				System.out.println(s1[i]);
			}
		}
		System.out.println("******************************************");
		
//	WAP to print the values of an array which are even	
		
//	WAP to add the all the elements of an array	
		int d [] = new int[5];
		int sum =0;
		d[0] = 10;
		d[1] = 21;
		d[2] = 2;
		d[3] = 60;
		d[4] = 60;
		
		for(int dd:d)
		{
			sum = sum +dd;
		}
		
		
		System.out.println(sum);
		
		
		
		
		
	}
	
	
}
