package Method;

public class BookManager {
	public static void main(String args[]){
	    Book b = new Book();
	    b.insertTitle("오만과 편견");
	    b.insertPrice(12000);
	    b.insertStock(true); // 현재 재고가 있는가?
	    b.insertScore(9.5);
	    b.showData(); 
	   //결과-오만과편견, 12000원, 재고있음, 평점 9.5
	}
}