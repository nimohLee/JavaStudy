class Ext4{
	public Ext4() {
		System.out.println("Ext4의 생성자 실행");
	}
}


public class ExtendsEx4 extends Ext4{
	public ExtendsEx4() {
		System.out.println("ExtendsEx4의 생성자 실행");
	}
	
	public static void main(String[] args) {
		ExtendsEx4 ee4 = new ExtendsEx4(); // 실행하면 'Ext4의 생성자'가 먼저 출력됨.
									      // Ext4는 생성한 적 없고 코드로 보이지도 않지만 상속받으면 바로 super();이 자동으로 생성됨
										 // super는 항상 제일 먼저!
										// 이 경우 Ext4 클래스의 생성자가 매개변수가 없는 생성자만 있거나, 생성자를 아예 안 만들었을 때에 국한됨 
	}
}
