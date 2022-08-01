
public class Television implements RemoteControl{
	private boolean isTvRun = false;
	private int volume =0;
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
	}

	@Override
	public void soundUp() {
		System.out.println("TV ������ ���Դϴ�");
		volume++;
		System.out.println("���� ������ "+volume+"�Դϴ�");
	}

	@Override
	public void soundDown() {
		System.out.println("TV ������ ���Դϴ�");
		volume--;
		System.out.println("���� ������ "+volume+"�Դϴ�");
	}
	
}