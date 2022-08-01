
public class TV implements Monitor {
	private boolean power = false;
	private int volume = 0;
	private int resX = 1920;
	private int resY = 1080;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		if (!power) {

			System.out.println("TV 전원을 켭니다");
			power = true;
		} else
			System.out.println("TV가 이미 켜져있습니다");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		if (power) {
			System.out.println("TV 전원을 끕니다");
			power = false;
		} else {
			System.out.println("TV가 켜져있지 않습니다");
		}

	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub

		if (power) {
			if (volume < MAX_VOLUME) {
				System.out.println("볼륨을 높입니다");
				volume++;
			} else
				System.out.println("최대 볼륨입니다");
		} else
			System.out.println("전원이 꺼져있습니다");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if (power) {
			if (volume > MIN_VOLUME) {
				System.out.println("볼륨을 낮춥니다");
				volume--;
			} else
				System.out.println("더 이상 볼륨을 낮출 수 없습니다 (현재 볼륨 : " + volume + ")");
		} else
			System.out.println("전원이 꺼져있습니다");
	}

	void setVolume(int i) {
		if (power) {
			if (i > 30) {
				System.out.println("최대 볼륨은 30 입니다\n다시 설정해주세요");
			} else if (i < 0)
				System.out.println("최소 볼륨은 0 입니다\n다시 설정해주세요");
			else
				volume = i;
		} else
			System.out.println("전원이 꺼져있습니다");
	}

	void printVolume() {
		System.out.println("현재 볼륨은" + volume + " 입니다.");
	}

	void setResolution(int x, int y) {
		resX = x;
		resY = y;
		if (power)
			System.out.println("변경된 해상도는 " + resX + "x" + resY + " 입니다");
		else
			System.out.println("전원이 꺼져있습니다");
	}

}
