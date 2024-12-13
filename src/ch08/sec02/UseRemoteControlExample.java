package ch08.sec02;

public class UseRemoteControlExample {

	public static void main(String[] args) {
		//인터페이스 타입의 변수 선언
		RemoteControl rc;
		
		//인터페이스와 객체 연결
//		rc = new TV();
		//리모컨으로 선언했지만 직접 사용되는건 티비다
		rc = new Audio();
		//어떤 객체가 오느냐에 따라 결과가 달라지는 다형성을 보여줌
		
		
		//인터페이스로 객체 사용
		rc.turnOn();
		rc.volumeUp(3);
		rc.turnOff();
	}

}
