package conditionalstatements;

public class BreakKeyword {
	
	

	
	
	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++)
		{		
			if(i==5)
			{
				System.out.println("executing break");
				break;
			}
					
			System.out.println("value of i is "+i);
		}
		
	}
}
