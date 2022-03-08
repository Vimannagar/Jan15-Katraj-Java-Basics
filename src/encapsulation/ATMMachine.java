package encapsulation;

public class ATMMachine {
	
	public void balEnq(int pin)
	{
		BankServer bs = new BankServer();
		
		bs.getBalance(pin);
		
	}
	
	
	public void withdrawl(int amount)
	{
		BankServer bs = new BankServer();
	
		bs.setBalance(amount);
		
	}
	
	public static void main(String[] args) {
		
		ATMMachine atm = new ATMMachine();
		
		atm.balEnq(1234);
		
		atm.withdrawl(5000);
		
	}

}
