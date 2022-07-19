package objectivePrac;

public class Bank {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		Account a1 = new Account();
		Customer c1 = new Customer("¿Ã»£πŒ",a1);
		
	
		c1.account.deposit(20000);
		c1.account.checkAccount();
		c1.account.withdraw(15000);
		c1.account.withdraw(15000);
		
	}
	
	
}
