
public class Navigation implements Monitor {
	private boolean power = false;
	private boolean isNaviRun = false;
	private boolean isMusicRun = false;
	private int volume = 0;
	
	public void turnOn() {
		// TODO Auto-generated method stub
		if (!power) {

			System.out.println("�׺���̼� ȭ���� �մϴ�");
			power = true;
		} else
			System.out.println("�׺���̼� ȭ���� �̹� �����ֽ��ϴ�");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		if (power) {
			System.out.println("�׺���̼� ȭ���� ���ϴ�");
			power = false;
		} else {
			System.out.println("�׺���̼� ȭ���� �������� �ʽ��ϴ�");
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
			System.out.println("�ִ� �����Դϴ�");}
		else
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
			System.out.println("�� �̻� ������ ���� �� �����ϴ� (���� ���� :"+volume+")");
	}else
		System.out.println("������ �����ֽ��ϴ�");
		
	}
		

	void setVolume(int i) {
		if(power) {
		if (i > 30) {
			System.out.println("�ִ� ������ 30 �Դϴ�\n�ٽ� �������ּ���");
		} else if (i < 0)
			System.out.println("�ּ� ������ 0 �Դϴ�\n�ٽ� �������ּ���");
		else
			volume = i;}
		else
			System.out.println("������ �����ֽ��ϴ�");
	}

	void printVolume() {
		System.out.println("���� ������" + volume + " �Դϴ�.");
	}

	void runNavi(String addr) {
		if(power) {
		System.out.println("'" + addr + "'(��)�� ����ȳ��� �����մϴ�");
		isNaviRun = true;}
		else
			System.out.println("�׺���̼��� �����ֽ��ϴ�");
	}

	void exitNavi() {
		if(power) {
		System.out.println("�ȳ��� �����մϴ�");
		isNaviRun = false;}
		else 
			System.out.println("�׺���̼��� �����ֽ��ϴ�");
	}

	void runMusic() {
	if(power) {
		System.out.println("������ ����մϴ�");
		isMusicRun = true;}
	else
		System.out.println("�׺���̼��� �����ֽ��ϴ�");
	}

	void exitMusic() {
		if(power) {
		System.out.println("��������� �����մϴ�");
		isMusicRun = false;}
		else
			System.out.println("�׺���̼��� �����ֽ��ϴ�");
	}
}
