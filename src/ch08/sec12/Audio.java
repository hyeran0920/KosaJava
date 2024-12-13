package ch08.sec12;

public class Audio implements RemoteControl{
	//필드 선언
	private int level;

	@Override
	public void turnOn() {
		System.out.println("오디오를 킵니다");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");
			
	}

	@Override
	public void volumeUp(int level) {
		System.out.println("오디오를 볼륨을 " + level + "로 올립니다.");
		
	}

	@Override
	public void volumeDown(int level) {
		System.out.println("오디오를 볼륨을 " + level + "로 내립니다.");

	}

	@Override
	public int plus(int x, int y) {
		return 0;
	}

	@Override
	public int getChannelNo() {
		return 0;
	}

}
