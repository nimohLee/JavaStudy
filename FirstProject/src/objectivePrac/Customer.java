package objectivePrac;

public class Customer {
	
	String cName;
	Account account; // °èÁÂ
	private int money; // µ·
	
	public Customer(String n, Account a){
		cName =n;
		account = a;
	}
	
	
	int getMoney() {
		return money;
	}
	void setMoney(int m) {
		money = m;
	}
}
