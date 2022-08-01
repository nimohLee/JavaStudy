
public class SettopBox implements RemoteControl {
	private boolean isSBRun = false;
	boolean isRunNetflix = false;
	boolean isRunYoutube = false;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("셋탑박스를 켭니다");
		isSBRun = true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		if(isSBRun)
			System.out.println("셋탑박스를 끕니다");
		else
			System.out.println("전원이 꺼져있습니다");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		if(isSBRun)
			System.out.println("볼륨을 높입니다");
		else
			System.out.println("먼저 셋탑박스 전원을 켜주세요");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		if(isSBRun)
			System.out.println("볼륨을 줄입니다");
		else
			System.out.println("먼저 셋탑박스 전원을 켜주세요");
	}

	void menu() {
		if(isSBRun)
			System.out.println("메뉴를 실행합니다");
		else
			System.out.println("먼저 셋탑박스 전원을 켜주세요");
	}
	
	void runNetflix() {
		
		System.out.println("넷플릭스를 실행합니다");
		isRunNetflix = true;
	}

 	void exitNetflix() {
		System.out.println("넷플릭스를 종료합니다");
		isRunNetflix = false;
	}

	void runYoutube() {
		System.out.println("유튜브를 실행합니다");
		isRunYoutube = false;
	}

	void exitYoutube() {
		System.out.println("유튜브를 종료합니다");
		isRunYoutube = false;
	}
}