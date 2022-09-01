
public class ATM_Not_Given_Tester {
	
	public static void main(String[] args)
	{
		ATM notChase = new ATM();
	
		notChase.openAccount(42069);
		
		notChase.depositMoney(42069, 1000);
		System.out.println(notChase.checkBalance(42069)); // Should be 1000
		
		notChase.closeAccount(42069); // Should not close since balance isn't 0
		notChase.depositMoney(42069, 100);
		System.out.println(notChase.checkBalance(42069)); // Should be 1100
		
		notChase.withdrawMoney(42069, 1100);
		System.out.println(notChase.checkBalance(42069)); // Should be 0.0
		notChase.closeAccount(42069); 
		System.out.println(notChase.depositMoney(42069, 100)); // Should return false
		
		
	}

}
