package Access_Modifer_3��°;
import test.*; // test ��Ű���� �ִ� ��� �� import

class B extends A{
	
	public B(){
		super(); // �θ� A�� �����ڸ� ȣ��(��ü ����, �ν��Ͻ�ȭ)
	}
	
	public void method() {
//		A a = new A(); // test ��Ű���� ������� A Ŭ������ ���������ڰ� protected�̹Ƿ� �ٷ� ����� �Ұ�.
						// ��� ��ӹ����� super();�� �θ� Ŭ���� ����(�ν��Ͻ�ȭ) ��  ��밡��		

		
	}
}

public class ProtectedClass {
	public static void main(String[] args) {
		DefaultClass d = new DefaultClass();
		B b = new B();
		b.method(); 
	}
}
