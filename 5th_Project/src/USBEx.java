interface USBA{
	String TYPE = "A";
	void speed();
	void printType();
}
public class USBEx implements USBA{

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("2.0 ���ǵ��Դϴ�.");
	}

	@Override
	public void printType() {
		// TODO Auto-generated method stub
		System.out.println(TYPE+"Ÿ��, �귣�� �Ｚ");
	}

	
	public static void main(String[] args) {
		USBEx ue = new USBEx();
		ue.speed();
		ue.printType();
	}
}
