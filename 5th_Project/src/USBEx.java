interface USBA{
	String TYPE = "A";
	void speed();
	void printType();
}

interface Samsung extends USBA{ // 인터페이스는 인터페이스를 상속할 수 있음
	void warranty();
}


public class USBEx implements Samsung{
// 상속은 반드시 하나만, 인터페이스 구현은 여러 개 가능
	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("2.0 스피드입니다.");
	}

	@Override
	public void printType() {
		// TODO Auto-generated method stub
		System.out.println(TYPE+"타입, 브랜드 삼성");
	}

	@Override
	public void warranty() {
		
	}
	
	public static void main(String[] args) {
		USBEx ue = new USBEx();
		ue.speed();
		ue.printType();
	}
}
