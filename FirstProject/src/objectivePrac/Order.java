package objectivePrac;

public class Order {
	private String productName;
	private String userName;
	private int many;
	private int price;
	private boolean isStock;
	
		
	
	
	public Order(User u, Product p, int m){
		productName = p.getProductName();
		userName = u.getUserName();
		price= p.getPrice();
		isStock = p.getStock();
		many=  m;
	}
	
	String getUserName() {
		return userName;
	}
	
	String getItem() {
		return productName;
	}
	
	public static void main(String[] args) {
		
		// User u1,u2 인스턴스화
		User u1 = new User("spaker38", "이호민", "부산", "01026462204");
		User u2 = new User("yujin", "정유진", "부산", "01026412224");
		
		// Product p1,p2 인스턴스화
		Product p1 = new Product("SSD",70000,2.1,true);
		Product p2 = new Product("레쓰비",1000,0.2,false);
		
		// Order o1,o2 인스턴스화
		Order o1 = new Order(u1,p1,1);
		Order o2 = new Order(u2,p2,3);
		
		//전체 제품 정보 출력
		System.out.println("==========================전체 제품정보=============================");
		p1.printProduct();
		System.out.println("................................................................");
		p2.printProduct();
		System.out.println("=================================================================");
		
		System.out.println();
		System.out.println();
		
		//전체 사용자 정보 출력
		System.out.println("==========================전체 사용자 정보============================");
		u1.printUserInfo();
		System.out.println(".................................................................");
		u2.printUserInfo();
		System.out.println("==================================================================");
		
		
		System.out.println();
		System.out.println();
		
		//전체 주문 정보 출력
		System.out.println("===========================전체 주문 정보=============================");
		System.out.println();
		
		if(o1.isStock)
		System.out.println("\""+o1.getUserName()+"\" 사용자가 구매한 제품은 "+"\""+o1.getItem()+"\"이며, 가격은 총 "+(o1.price*o1.many)+"원, 개수는 "+o1.many+"개 입니다.");
		else {
			System.out.println("\""+o1.getUserName()+"\" 사용자가 구매한 제품은 "+"\""+o1.getItem()+"\"이며, 가격은 총 "+(o1.price*o1.many)+"원, 개수는 "+o1.many+"개 입니다.");
			System.out.println("----------------------'"+o2.getItem()+"'재고 없음------------------------");
		}
		System.out.println();
		System.out.println("..................................................................");
		System.out.println();
		
		if(o2.isStock)
		System.out.println("\""+o2.getUserName()+"\" 사용자가 구매한 제품은 "+"\""+o2.getItem()+"\"이며, 가격은 총 "+(o2.price*o2.many)+"원, 개수는 "+o2.many+"개 입니다.");
		else {
			System.out.println("\""+o2.getUserName()+"\" 사용자가 구매한 제품은 "+"\""+o2.getItem()+"\"이며, 가격은 총 "+(o2.price*o2.many)+"원, 개수는 "+o2.many+"개 입니다.");
			System.out.println("----------------------'"+o2.getItem()+"'재고 없음------------------------");
		}
		
		System.out.println();
		System.out.println("==================================================================");
	}


}