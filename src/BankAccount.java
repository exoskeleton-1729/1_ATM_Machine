import java.util.*;
public class BankAccount {
	
	private HashMap<Long, Double> accounts = new HashMap<Long, Double> ();
	
	// Opens an account with default balance of 0.0 by adding account to HashMap
	public void openAccount(long accountNumber)
	{
		accounts.put(accountNumber, 0.0);
	}
	
	// Opens an account with specified initial deposit by adding account to HashMap
	public void openAccount(long accountNumber, double initialDeposit)
	{
		accounts.put(accountNumber, round("" + initialDeposit));
	}
	
	// If the account exists, this method closes it if and only if the balance is 0.0
	public void closeAccount(long accountNumber)
	{
		if(accounts.get(accountNumber).equals(0.0))
		{
			accounts.remove(accountNumber);
		}
	}
	
	// If the account exists, returns the balance. If it doesn't exist, returns 0.0
	public double checkBalance(long accountNumber)
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
	public boolean depositMoney(long accountNumber, double deposit)
	{
		if(accounts.containsKey(accountNumber) && deposit >= 0.0)
		{
			accounts.put(accountNumber, accounts.get(accountNumber) + round("" + deposit));
			return true;
		}
		return false;
	}
	
	// Returns true if the account exists and the withdrawal amount is greater than or equal to zero, otherwise false
	public boolean withdrawMoney(long accountNumber, double withdraw)
	{
		if(accounts.containsKey(accountNumber) && withdraw >= 0.0)
		{
			accounts.put(accountNumber, accounts.get(accountNumber) - round("" + withdraw));
			return true;
		}
		return false;
	}
	
	public double round(String input)
	{
		int firstTwo = Integer.parseInt(input.substring(input.indexOf(".") + 1, input.indexOf(".") + 3));
		int toRound = Integer.parseInt("" + input.charAt(input.indexOf(".") + 3));
		if(toRound >= 5)
		{
			firstTwo++;
		}
		return Double.parseDouble(input.substring(0, input.indexOf(".") + 1) + firstTwo);
	}
}
