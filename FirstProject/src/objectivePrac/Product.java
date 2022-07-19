package objectivePrac;

public class Product {
	private String name;
	private int price;
	private double weight;
	private String stockPrint;
	private int stock;
	

	
	public Product(String pName,int pPrice, double pWeight, int pStock){
		name = pName;
		price = pPrice;
		weight = pWeight;
		stock = pStock;
		
	}
	
	String getProductName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
	int getStock() {
		return stock;
	}
	
	void plusStock() {
		stock++;
	}
	
	void minusStock() {
		stock--;
	}
	
	void printProduct() {
		System.out.println("제품명 :"+name+"\n가격 :"+price+"\n무게 :"+weight+"\n재고 :"+stockPrint);
	}
	
	
	
}
