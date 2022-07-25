package ExtendsExs_2번째;
// final class Ext5{	:  class 앞에 final이 붙으면 상수화가 되어 더이상 변경이 불가능하다 = 상속이 불가능하다
class Ext5{
	public void printExt5() { // 반환형 앞에 final도 마찬가지로 변경 or 오버라이딩 불가능 ( why? final은 말 그대로 최종본. 손댈 수가 없음)
		System.out.println("이것은 Ext5");
	}
}

public class ExtendsEx5 extends Ext5{ // Ext5를 상속받은 ExtendsEx5
	
	@Override 				  // 오버라이딩 하면 메서드 위에 @Override 써주면 좋음. 오버라이딩하면서 발생하는 문제를 체크할 수 있음(예를들면 오버라이딩하려는 메서드와 이름다름) 
	public void printExt5() { // 상속받은 부모(Ext5)에 있는 메서드와 동일한 이름
							  // 이것을 메서드 재정의 즉 오버라이딩(overriding)이라 함
		System.out.println("이것은 ExtendsEx5");//오버라이딩하면 내 것 우선이므로 바뀐 메서드가 실행됨
	}
	
	public void printSuper() {
		super.printExt5();
	}
	
	
	public static void main(String[] args) {
		// 오버라이드된 메서드의 경우 main에서 사용가능하지만 
		// 부모 메서드는 일반적인 방식으로 main 메서드에서 사용이 불가
		ExtendsEx5 ee5 = new ExtendsEx5();
		
		ee5.printExt5();
		ee5.printSuper();
	}
}

// 출력하면 '이것은 ExtendsEx5 '로 출력됨
