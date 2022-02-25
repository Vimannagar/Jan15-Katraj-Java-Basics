package conditionalstatements;

public class Continue2 {
	
	public static void main(String[] args) {
		int i =1;
		
		while(i<=5)
		{
			if(i>2)
			{
			
			System.out.println(i);
			i++;
			continue;
			}
			
			System.out.println("without continue statement");
			i++;
			
		}
	}

}
