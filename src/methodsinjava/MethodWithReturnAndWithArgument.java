package methodsinjava;

public class MethodWithReturnAndWithArgument {
	
	
	
	public static int areaCalculator(int length, int breadth)
	{
		int area = length*breadth;
		
		return area;
		
		
	}
	
	
	public static void main(String[] args) {
		
		int area1 = areaCalculator(10, 50);//500
		
		int area2 = areaCalculator(20, 30);//600
		
	int	area3 = areaCalculator(80, 10);//800
	
	int totalarea = area1+ area2+area3;
	System.out.println(totalarea);
		
		
	}

}
