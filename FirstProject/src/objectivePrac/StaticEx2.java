package objectivePrac;

public class StaticEx2 { // static은 new 안해도 쓸 수 있다. 모든 인스턴스에 변함없이 동일하므로.
	public static void main(String[] args) {
		
		Static s = new Static();
		Static s2 = new Static();
		// 변하지 않는 자주 쓰는 변수나 메서드를 주로 정적처리 하여 사용한다.
		System.out.println(s.i);
		System.out.println(++s2.i);
		System.out.println(s.i);
		// 정적(static) 변수, 클래스, 메소드 new 없이 사용가능
		
	}
}