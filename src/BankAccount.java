import java.util.*;
public class BankAccount {
	
	private HashMap<Long, Double> accounts = new HashMap<Long, Double> ();
	
	public void openAccount(Long accountNumber)
	{
		accounts.put(accountNumber, 0.0);
	}
	
	public void openAccount(Long accountNumber, double initialDeposit)
	{
		accounts.put(accountNumber, initialDeposit);
	}
	
	public void closeAccount(Long accountNumber)
	{
		if(accounts.get(accountNumber).equals(0.0))
		{
			accounts.remove(accountNumber);
		}
	}
	
	public boolean depositMoney(Long accountNumber, double deposit)
	{
		return false;
	}
	
	public boolean withdrawMoney(Long accountNumber, double withdraw)
	{
		return false;
	}
}
