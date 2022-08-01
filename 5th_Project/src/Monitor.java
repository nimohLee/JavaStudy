
public interface Monitor {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	void turnOn();
	void turnOff();
	void volumeUp();
	void volumeDown();
}
