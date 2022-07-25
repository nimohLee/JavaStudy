package Access_Modifer_3번째;
import test.*; // test 패키지에 있는 모든 것 import

class B extends A{
	
	public B(){
		super(); // 부모 A의 생성자를 호출(객체 생성, 인스턴스화)
	}
	
	public void method() {
//		A a = new A(); // test 패키지에 만들어진 A 클래스는 접근제한자가 protected이므로 바로 사용은 불가.
						// 대신 상속받으면 super();로 부모 클래스 생성(인스턴스화) 후  사용가능		

		
	}
}

public class ProtectedClass {
	public static void main(String[] args) {
		DefaultClass d = new DefaultClass();
		B b = new B();
		b.method(); 
	}
}
