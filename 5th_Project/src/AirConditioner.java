
public class AirConditioner implements RemoteControl{
	int temp=25;
	private boolean isAirconRun = false;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("�������� �մϴ�");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("�������� ���ϴ�");
	}

	@Override
	public void soundUp() {
	}

	@Override
	public void soundDown() {
	}
	
	void tempUp() {
		System.out.println("�µ��� �ø��ϴ�");
		temp++;
	}
	void tempDown() {
		System.out.println("�µ��� �����ϴ�");
		temp--;
	}
	
	void printTemp() {
		System.out.println("���� �µ��� "+temp+"�� �Դϴ�");
	}
	
}
