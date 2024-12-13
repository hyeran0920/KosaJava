package ch08.sec02;

public interface RemoteControl {
	//상수 정의
//	public static final int VALUE = 10;
	//인터페이스는 staic final이 없어도 상수로 선언된다
	public int MAX_VALUE = 10;
	public int MIN_VALUE = 10;
	
	
	//사용방법을 추상 메소드 형태로 정의
	public void turnOn();
	public void turnOff();

	public void volumeUp(int level);
	public void volumeDown(int level);

	public int plus(int x, int y);
	public int getChannelNo();
	
}
