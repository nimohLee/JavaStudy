
public class Smart implements Monitor{
	private boolean power = false;
	private int volume = 0;
	
	public void turnOn() {
		// TODO Auto-generated method stub
		if (!power) {

			System.out.println("����Ʈ�� ȭ���� �մϴ�");
			power = true;
		} else
			System.out.println("����Ʈ�� ȭ���� �̹� �����ֽ��ϴ�");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		if (power) {
			System.out.println("����Ʈ�� ȭ���� ���ϴ�");
			power = false;
		} else {
			System.out.println("����Ʈ�� ȭ���� �������� �ʽ��ϴ�");
		}

	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		if(power) {
		if (volume < MAX_VOLUME) {
			System.out.println("������ ���Դϴ�");
			volume++;
		} else
			System.out.println("�ִ� �����Դϴ�");
	
		}else
			System.out.println("������ �����ֽ��ϴ�");
			}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if(power) {
			
		
		if (volume > MIN_VOLUME) {
			System.out.println("������ ����ϴ�");
			volume--;
		} else
			System.out.println("�� �̻� ������ ���� �� �����ϴ� (���� ���� : "+volume+")");
	}
		else
			System.out.println("������ �����ֽ��ϴ�.");}

}
