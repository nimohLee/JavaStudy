
public class Navigation implements Monitor {
	private boolean power = false;
	private boolean isNaviRun = false;
	private boolean isMusicRun = false;
	private int volume = 0;
	
	public void turnOn() {
		// TODO Auto-generated method stub
		if (!power) {

			System.out.println("네비게이션 화면을 켭니다");
			power = true;
		} else
			System.out.println("네비게이션 화면이 이미 켜져있습니다");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		if (power) {
			System.out.println("네비게이션 화면을 끕니다");
			power = false;
		} else {
			System.out.println("네비게이션 화면이 켜져있지 않습니다");
		}

	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		
		if(power) {
		if (volume < MAX_VOLUME) {
			System.out.println("볼륨을 높입니다");
			volume++;
		} else
			System.out.println("최대 볼륨입니다");}
		else
			System.out.println("전원이 꺼져있습니다");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if(power) {
		if (volume > MIN_VOLUME) {
			System.out.println("볼륨을 낮춥니다");
			volume--;
		} else
			System.out.println("더 이상 볼륨을 낮출 수 없습니다 (현재 볼륨 :"+volume+")");
	}else
		System.out.println("전원이 꺼져있습니다");
		
	}
		

	void setVolume(int i) {
		if(power) {
		if (i > 30) {
			System.out.println("최대 볼륨은 30 입니다\n다시 설정해주세요");
		} else if (i < 0)
			System.out.println("최소 볼륨은 0 입니다\n다시 설정해주세요");
		else
			volume = i;}
		else
			System.out.println("전원이 꺼져있습니다");
	}

	void printVolume() {
		System.out.println("현재 볼륨은" + volume + " 입니다.");
	}

	void runNavi(String addr) {
		if(power) {
		System.out.println("'" + addr + "'(으)로 주행안내를 시작합니다");
		isNaviRun = true;}
		else
			System.out.println("네비게이션이 꺼져있습니다");
	}

	void exitNavi() {
		if(power) {
		System.out.println("안내를 종료합니다");
		isNaviRun = false;}
		else 
			System.out.println("네비게이션이 꺼져있습니다");
	}

	void runMusic() {
	if(power) {
		System.out.println("음악을 재생합니다");
		isMusicRun = true;}
	else
		System.out.println("네비게이션이 꺼져있습니다");
	}

	void exitMusic() {
		if(power) {
		System.out.println("음악재생을 종료합니다");
		isMusicRun = false;}
		else
			System.out.println("네비게이션이 꺼져있습니다");
	}
}
