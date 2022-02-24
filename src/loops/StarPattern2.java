package loops;

public class StarPattern2 {

	
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)// outer for loop
		{
			
		for(int j = 1; j<=5; j++)// inner for loop
		{
			if(j>=i && j<=5)

			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		
		}
		
		System.out.println();
		
		
		}
	}

}
