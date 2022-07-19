package objectivePracEx;

public class Order {
	int orderCnt;//�� �ֹ���
	int price;//�� �ֹ��� ó���ϰ� �� �ݾ�
	
	void sellProduct(Product p, Customer c) {
		orderCnt++;// �� �޼��尡 ����� �� ���� ������ 1�� ����
		price = price + p.price;//���� price�� ��ǰ�� price�� ������
		p.minusStock();// ��� 1 ����
	}
	
	void printOrderAll() {
		System.out.print("�� �ֹ� ���� :"+orderCnt);
		System.out.println(" �� ���� :"+price);		
	}
	void printAllStock(Product...p) {// ��� Ȯ��
		for(int i=0;i<p.length;i++) {
			p[i].printProduct();
		}
	}
	
	public static void main(String[] args) {
		Order o = new Order();// �ֹ� ���α׷��� �ѹ��� �����ϸ� �ȴ�.
		
		
		Customer c = new Customer("���̵�", "���̸�");
		Customer c2 = new Customer("���̵�2", "���̸�");// ����� ��� �߰� ����
		
		Product shoes = new Product("�Ź�", 10000, 700, 10);
		Product phone = new Product("��ȭ��", 8000, 500, 100);
		Product pencle = new Product("����", 500, 100, 50);// ��ǰ ��� �߰� ����
		
		o.sellProduct(shoes,c);// ������ �Ⱦ��� �� 
		o.sellProduct(phone,c2);// ������ �Ⱦ��� ��
		o.sellProduct(pencle,c2);// ������ �Ⱦ��� ��
		o.sellProduct(pencle,c2);// ������ �Ⱦ��� ��
		o.sellProduct(phone,c);// ������ �Ⱦ��� ��
	
		o.printOrderAll();
		
		o.printAllStock(shoes, phone, pencle);
		
	}
	
}
