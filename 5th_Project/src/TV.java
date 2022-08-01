
public class TV implements Monitor {
	private boolean power = false;
	private int volume = 0;
	private int resX = 1920;
	private int resY = 1080;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		if (!power) {

			System.out.println("TV ������ �մϴ�");
			power = true;
		} else
			System.out.println("TV�� �̹� �����ֽ��ϴ�");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		if (power) {
			System.out.println("TV ������ ���ϴ�");
			power = false;
		} else {
			System.out.println("TV�� �������� �ʽ��ϴ�");
		}

	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub

		if (power) {
			if (volume < MAX_VOLUME) {
				System.out.println("������ ���Դϴ�");
				volume++;
			} else
				System.out.println("�ִ� �����Դϴ�");
		} else
			System.out.println("������ �����ֽ��ϴ�");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if (power) {
			if (volume > MIN_VOLUME) {
				System.out.println("������ ����ϴ�");
				volume--;
			} else
				System.out.println("�� �̻� ������ ���� �� �����ϴ� (���� ���� : " + volume + ")");
		} else
			System.out.println("������ �����ֽ��ϴ�");
	}

	void setVolume(int i) {
		if (power) {
			if (i > 30) {
				System.out.println("�ִ� ������ 30 �Դϴ�\n�ٽ� �������ּ���");
			} else if (i < 0)
				System.out.println("�ּ� ������ 0 �Դϴ�\n�ٽ� �������ּ���");
			else
				volume = i;
		} else
			System.out.println("������ �����ֽ��ϴ�");
	}

	void printVolume() {
		System.out.println("���� ������" + volume + " �Դϴ�.");
	}

	void setResolution(int x, int y) {
		resX = x;
		resY = y;
		if (power)
			System.out.println("����� �ػ󵵴� " + resX + "x" + resY + " �Դϴ�");
		else
			System.out.println("������ �����ֽ��ϴ�");
	}

}
