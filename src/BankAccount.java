import java.util.*;
public class BankAccount {
	
	private HashMap<Long, Double> accounts = new HashMap<Long, Double> ();
	
	// Opens an account with default balance of 0.0 by adding account to HashMap
	public void openAccount(Long accountNumber)
	{
		accounts.put(accountNumber, 0.0);
	}
	
	// Opens an account with specified initial deposit by adding account to HashMap
	public void openAccount(Long accountNumber, double initialDeposit)
	{
		accounts.put(accountNumber, initialDeposit);
	}
	
	// If the account exists, this method closes it if and only if the balance is 0.0
	public void closeAccount(Long accountNumber)
	{
		if(accounts.get(accountNumber).equals(0.0))
		{
			accounts.remove(accountNumber);
		}
	}
	
	// If the account exists, returns the balance. If it doesn't exist, returns 0.0
	public double checkBalance(Long accountNumber)
	{
		if(accounts.containsKey(accountNumber))
		{
			return accounts.get(accountNumber);
		}
		else
		{
			return 0.0;
		}
	}
	
	// Returns true if the account exists and the deposit is greater than or equal to zero, otherwise false
	public boolean depositMoney(Long accountNumber, double deposit)
	{
		if(accounts.containsKey(accountNumber) && deposit >= 0.0)
		{
			accounts.put(accountNumber, accounts.get(accountNumber) + deposit);
			return true;
		}
		return false;
	}
	
	// Returns true if the account exists and the withdrawal amount is greater than or equal to zero, otherwise false
	public boolean withdrawMoney(Long accountNumber, double withdraw)
	{
		if(accounts.containsKey(accountNumber) && withdraw >= 0.0)
		{
			accounts.put(accountNumber, accounts.get(accountNumber) - withdraw);
			return true;
		}
		return false;
	}
}
