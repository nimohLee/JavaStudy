interface Number {
}

class Inte implements Number {
}

class Floa implements Number {
}

class Doub implements Number {
}

public class Polymorphism {
	
//	Overloading
//	void printNumber(Inte i) {}
//	void printNumber(Floa f) {}
//	void printNumber(Doub d) {}

	void printNumber(Number n) {} // �������̽��� �ϳ��� ��� ó�� ���� (�Ű������� ������)
	
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.printNumber(new Inte());
		p.printNumber(new Floa());
		p.printNumber(new Doub());
	}
}