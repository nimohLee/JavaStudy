package objectivePracEx;

public class Order {
	int orderCnt;//총 주문수
	int price;//총 주문을 처리하고 번 금액
	
	void sellProduct(Product p, Customer c) {
		orderCnt++;// 이 메서드가 실행될 때 마다 무조건 1씩 증가
		price = price + p.price;//현재 price에 제품의 price를 더해줌
		p.minusStock();// 재고 1 빼기
	}
	
	void printOrderAll() {
		System.out.print("총 주문 개수 :"+orderCnt);
		System.out.println(" 총 수익 :"+price);		
	}
	void printAllStock(Product...p) {// 재고 확인
		for(int i=0;i<p.length;i++) {
			p[i].printProduct();
		}
	}
	
	public static void main(String[] args) {
		Order o = new Order();// 주문 프로그램은 한번만 실행하면 된다.
		
		
		Customer c = new Customer("아이디", "최이름");
		Customer c2 = new Customer("아이디2", "김이름");// 사용자 계속 추가 가능
		
		Product shoes = new Product("신발", 10000, 700, 10);
		Product phone = new Product("전화기", 8000, 500, 100);
		Product pencle = new Product("연필", 500, 100, 50);// 제품 계속 추가 가능
		
		o.sellProduct(shoes,c);// 물건을 팔았을 때 
		o.sellProduct(phone,c2);// 물건을 팔았을 때
		o.sellProduct(pencle,c2);// 물건을 팔았을 때
		o.sellProduct(pencle,c2);// 물건을 팔았을 때
		o.sellProduct(phone,c);// 물건을 팔았을 때
	
		o.printOrderAll();
		
		o.printAllStock(shoes, phone, pencle);
		
	}
	
}
