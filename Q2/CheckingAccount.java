public class CheckingAccount 
{
    private double balance;
	private String accountNumber;
	
	public CheckingAccount(double balance, String accountNumber) 
    	{
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public void deposit(double amount) throws InsufficientFundsException
    	{
		if (amount > 0)
		{
			this.balance += amount;
			System.out.println("$" + this.balance + " has been deposited");
		}
		else
		{
			throw new IllegalArgumentException("The deposit amount is invalid");
		}
	}
	
	public void withdraw(double amount) throws InsufficientFundsException 
    	{
		if (amount > balance) 
       		{
			throw new InsufficientFundsException(amount - balance);
		}
		if (amount <= 0)
		{
			throw new IllegalArgumentException("The withdrawal amount is invalid");
		}
        	else 
        	{
			this.balance -= amount;
			System.out.println("The balance after withdraw is: $" + this.balance);
		}
	}

	public double getBalance() 
    	{
		return balance;
	}

	public String getNumber() 
    	{
		return accountNumber;
	}
}
