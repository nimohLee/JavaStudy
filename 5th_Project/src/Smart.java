
public class Smart implements Monitor{
	private boolean power = false;
	private int volume = 0;
	
	public void turnOn() {
		// TODO Auto-generated method stub
		if (!power) {

			System.out.println("스마트폰 화면을 켭니다");
			power = true;
		} else
			System.out.println("스마트폰 화면이 이미 켜져있습니다");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		if (power) {
			System.out.println("스마트폰 화면을 끕니다");
			power = false;
		} else {
			System.out.println("스마트폰 화면이 켜져있지 않습니다");
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
			System.out.println("최대 볼륨입니다");
	
		}else
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
			System.out.println("더 이상 볼륨을 낮출 수 없습니다 (현재 볼륨 : "+volume+")");
	}
		else
			System.out.println("전원이 꺼져있습니다.");}

}
