class Ext8Parents{
	int x;
	public void printExt8Parent() {
		System.out.println("부모 클래스");
	}
}


class Ext8Child extends Ext8Parents{
	int y;
	public void printExt8Child() {
		System.out.println("자식 클래스");
	}
}



public class ExtendsEx8 {
 public static void main(String[] args) {
	Ext8Parents p = new Ext8Child();
	p.printExt8Parent();
//	p.printExt8Child(); // 자식 클래스로 만들었지만(new) 부모 클래스 타입으로 자동변환되어 자식 클래스 메서드 사용 불가 ( p.332~ )
	//Ext8Child c = new Ext8Parents(); // 부모를 생성하여(new 하여) 자식에 넣을 수는 없음
	
	Ext8Child c = (Ext8Child) p;
	c.printExt8Parent();
	c.printExt8Child();
	
 	}
}
