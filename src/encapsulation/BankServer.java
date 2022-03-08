package encapsulation;

public class BankServer {
	
	private int cust1balance = 50000;
	
	
	
	public void getBalance(int pin)
	{
		if(pin == 1234)
		{
			System.out.println("Your balance is :"+cust1balance);
		}
		else
		{
			System.out.println("Please check your pin and try again");
		}
	}
	
	
	public void setBalance(int amount)
	{
		if(amount<=cust1balance)
		{
			cust1balance= cust1balance-amount;
			System.out.println("Amount "+amount+"has been withdrawl your balance is :"+cust1balance);
		}
	}

}
