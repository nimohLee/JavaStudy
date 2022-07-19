package objectivePrac;

public class Product {
	private String name;
	private int price;
	private double weight;
	private String stockPrint;
	private boolean stock;
	

	
	public Product(String pName,int pPrice, double pWeight, boolean pStock){
		name = pName;
		price = pPrice;
		weight = pWeight;
		if(pStock == true) {
		stockPrint = "O";
		stock = pStock;
		}
		else {
			stockPrint = "X";
			stock = pStock;}
	}
	
	String getProductName() {
		return name;
	}
	
	int getPrice() {
		return price;
	}
	
	boolean getStock() {
		return stock;
	}
	
	void printProduct() {
		System.out.println("제품명 :"+name+"\n가격 :"+price+"\n무게 :"+weight+"\n재고 :"+stock);
	}
	
	
	
}
