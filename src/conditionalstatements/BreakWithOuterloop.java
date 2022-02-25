package conditionalstatements;

public class BreakWithOuterloop {
	
	
	public static void main(String[] args) {
		
		
		for(int j =0; j<=5; j++)
		{
		
		for(int i = 0; i<=10; i++)
		{
			System.out.println("i value is "+i);
			if(i==2)
			{
				break;
			}
			
		}
		
		}
		
	}

}
