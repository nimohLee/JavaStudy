
public class AirConditioner implements RemoteControl{
	int temp=25;
	private boolean isAirconRun = false;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("에어컨을 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("에어컨을 끕니다");
	}

	@Override
	public void soundUp() {
	}

	@Override
	public void soundDown() {
	}
	
	void tempUp() {
		System.out.println("온도를 올립니다");
		temp++;
	}
	void tempDown() {
		System.out.println("온도를 내립니다");
		temp--;
	}
	
	void printTemp() {
		System.out.println("현재 온도는 "+temp+"도 입니다");
	}
	
}
