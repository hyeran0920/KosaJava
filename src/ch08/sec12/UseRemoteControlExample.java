package ch08.sec12;

public class UseRemoteControlExample {
	public static void use(RemoteControl rc) {
		rc.turnOn();
		rc.volumeUp(3);
		rc.volumeDown(2);
		rc.turnOff();
		
		if(rc instanceof TV) { //rc에 들어오는 인터페이스가 tv면 타입 변환
			TV tv = (TV) rc; //강제 타입변환
			tv.display();//tv에 display를 쓰고싶음
			
		}
	}

	public static void main(String[] args) {
	
	}

}
