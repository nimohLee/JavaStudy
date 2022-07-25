package test;

public class A {
	protected A() {// protected 접근 제한자로 A 생성자 작성 
		// protected 는 같은 패키지에 있는 클래스 접근 가능
		System.out.println("A");
	}
}
