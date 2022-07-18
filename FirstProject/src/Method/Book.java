package Method;

public class Book {

	String title;
	int price;
	String isStock;
	double score;
	
	
	
	public void insertTitle(String s) {
		// TODO Auto-generated method stub
		title = s;
	}

	public void insertPrice(int i) {
		// TODO Auto-generated method stub
		price = i;
	}

	public void insertStock(boolean b) {
		// TODO Auto-generated method stub
		isStock = (b==true)?"재고있음":"재고없음";
	}

	public void insertScore(double d) {
		// TODO Auto-generated method stub
		score = d;
	}

	public void showData() {
		// TODO Auto-generated method stub
		System.out.println(title+", "+price+"원, "+isStock+", 평점 "+score);
	}

}
