	interface Tire {
	final int A = 2;
	
	void printInfo();
}

class Kumho implements Tire {
	@Override
	public void printInfo() {

	}

	public void setKumho() {

	}
}

class Hankook implements Tire {
	@Override
	public void printInfo() {

	}

	void setHankook() {

	}
}

public class CastingEx {
	public static void main(String[] args) {
		Hankook h = new Hankook();
		h.setHankook();
		Kumho k = new Kumho();
		k.setKumho();
		Tire t1 = new Hankook();
//		t1.setHankook();// X
		Tire t2 = new Kumho();
		t2.printInfo(); // Kumho가 참조한 인터페이스로 형변환 -> 인터페이스내의 추상 메서드 접근은 됨
		int a= t2.A; // 접근 가능 
		System.out.println(t1.A);
		
		Kumho k2 = (Kumho) t2; // 자동변환 했다가 반대로 돌아갈 경우 강제로 변환( ) 가능
		k2.setKumho(); 
	}	
}