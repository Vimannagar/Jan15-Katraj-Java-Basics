package exceptionhandlingdiscussion;

public class HolidayChecker {
	
	
	public static void todayClassAvailable() throws ArithmeticException
	{
		int date = 18;
		
		if(date==18)
		{
			throw new TodayHoliException("There is no class please enjoy!");
		}
	}
	
	public static void main(String[] args) {
		
		todayClassAvailable();
		
	}


}
