
public class SettopBox implements RemoteControl {
	private boolean isSBRun = false;
	boolean isRunNetflix = false;
	boolean isRunYoutube = false;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("��ž�ڽ��� �մϴ�");
		isSBRun = true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		if(isSBRun)
			System.out.println("��ž�ڽ��� ���ϴ�");
		else
			System.out.println("������ �����ֽ��ϴ�");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		if(isSBRun)
			System.out.println("������ ���Դϴ�");
		else
			System.out.println("���� ��ž�ڽ� ������ ���ּ���");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		if(isSBRun)
			System.out.println("������ ���Դϴ�");
		else
			System.out.println("���� ��ž�ڽ� ������ ���ּ���");
	}

	void menu() {
		if(isSBRun)
			System.out.println("�޴��� �����մϴ�");
		else
			System.out.println("���� ��ž�ڽ� ������ ���ּ���");
	}
	
	void runNetflix() {
		
		System.out.println("���ø����� �����մϴ�");
		isRunNetflix = true;
	}

 	void exitNetflix() {
		System.out.println("���ø����� �����մϴ�");
		isRunNetflix = false;
	}

	void runYoutube() {
		System.out.println("��Ʃ�긦 �����մϴ�");
		isRunYoutube = false;
	}

	void exitYoutube() {
		System.out.println("��Ʃ�긦 �����մϴ�");
		isRunYoutube = false;
	}
}