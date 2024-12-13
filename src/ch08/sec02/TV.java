package ch08.sec02;

//리모컨을 통해서 구현할 객체
public class TV implements RemoteControl{
	//필드 선언
	private int level;

	@Override
	public void turnOn() {
		System.out.println("TV를 킵니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
			
	}

	@Override
	public void volumeUp(int level) {
		System.out.println("TV 볼륨을 " + level + "로 올립니다.");
		
	}

	@Override
	public void volumeDown(int level) {
		System.out.println("TV 볼륨을 " + level + "로 내립니다.");

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
