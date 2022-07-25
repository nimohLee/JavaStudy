class Ext1{
	int x;
	int y;
	
	public void printExt1() {
		System.out.println(x+":"+y);
	}
	
}


public class ExtendsEx1 extends Ext1{ // 내부적으로 Ext1을 가지고 있다. (extends Class는 상속), 상속은 클래스 하나만 가능

	public static void main(String[] args) {
		ExtendsEx1 ee = new ExtendsEx1(); 
		
		// ExtendsEx1에서 Ext1을 상속받아(extends Ext1) 사실상 가지고 있기 때문에 Ext1의 객체 생성 없이 Ext1의 메서드와 변수를 사용할 수 있음
		ee.printExt1();   
		System.out.println(ee.x);
	}
}
