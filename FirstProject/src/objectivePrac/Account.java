package objectivePrac;

public class Account {
	
	private String name;
	private int aNumber;
	private int aMoney;
	
	
	void deposit(int money) {
		aMoney = money;
		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�. ���� �ܾ� : "+aMoney+"��");
	}
	
	void withdraw(int money) {
		if(aMoney<money)
			System.out.println("�ܾ��� �����մϴ�.");
		
		else {
			aMoney -= money;
			System.out.println(money+"�� ����� �Ϸ�Ǿ����ϴ�.");
			System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�. ���� �ܾ� : "+aMoney+"��");
		}
	}
	
	void checkAccount() {
		System.out.println("�ܾ� : "+aMoney+"��");
	}
	
}
