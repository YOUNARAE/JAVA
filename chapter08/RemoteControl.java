package chapter08;

public interface RemoteControl {
	//상수와 추상메서드만 선언할 수 있다/
	//인터페이스는 필드를 선언할 수 없다	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	void turnOn();
	void turnOff();
	void setVolume(int volume);	
	
}
