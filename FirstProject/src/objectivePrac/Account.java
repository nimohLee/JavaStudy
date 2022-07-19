package objectivePrac;

public class Account {
	
	private String name;
	private int aNumber;
	private int aMoney;
	
	
	void deposit(int money) {
		aMoney = money;
		System.out.println("입금이 완료되었습니다. 현재 잔액 : "+aMoney+"원");
	}
	
	void withdraw(int money) {
		if(aMoney<money)
			System.out.println("잔액이 부족합니다.");
		
		else {
			aMoney -= money;
			System.out.println(money+"원 출금이 완료되었습니다.");
			System.out.println("입금이 완료되었습니다. 현재 잔액 : "+aMoney+"원");
		}
	}
	
	void checkAccount() {
		System.out.println("잔액 : "+aMoney+"원");
	}
	
}
