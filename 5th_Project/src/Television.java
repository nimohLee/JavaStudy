
public class Television implements RemoteControl{
	private boolean isTvRun = false;
	private int volume =0;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}

	@Override
	public void soundUp() {
		System.out.println("TV 볼륨을 높입니다");
		volume++;
		System.out.println("현재 볼륨은 "+volume+"입니다");
	}

	@Override
	public void soundDown() {
		System.out.println("TV 볼륨을 줄입니다");
		volume--;
		System.out.println("현재 볼륨은 "+volume+"입니다");
	}
	
}