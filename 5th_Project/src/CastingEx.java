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
		t2.printInfo(); // Kumho�� ������ �������̽��� ����ȯ -> �������̽����� �߻� �޼��� ������ ��
		int a= t2.A; // ���� ���� 
		System.out.println(t1.A);
		
		Kumho k2 = (Kumho) t2; // �ڵ���ȯ �ߴٰ� �ݴ�� ���ư� ��� ������ ��ȯ( ) ����
		k2.setKumho(); 
	}	
}