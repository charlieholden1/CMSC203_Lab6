
public class SavingsAccount extends BankAccount{

	private double rate = 00.25;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest()
	{
		double interest = rate/100*super.getBalance();
		super.deposit(interest);
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount)
	{
		super(oldAccount, amount);
		savingsNumber++;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
	}
}
