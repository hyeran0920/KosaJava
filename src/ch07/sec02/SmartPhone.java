package ch07.sec02;

public class SmartPhone extends Phone{
	   // 필드 선언
	   public boolean wifi;

	   // 생성자 선언
	   public SmartPhone(String model, String color) {
//		  super(); //컴파일시 자동적으로 부모 생성자를 만들기 때문에 부모의 phone이 출력된다
		  super(model, color); //부모가 생성자가 명시되어있는 경우 super안에 값을 줘야한다
		  System.out.println("자식 생성자 실행.");

	      this.model = model;
	      this.color = color;
	   }

	   // 메소드 선언
	   public void setWifi(boolean wifi) {
	      this.wifi = wifi;
	      System.out.println("와이파이 상태를 변경했습니다.");
	   }
	   
	   public void internet() {
	      System.out.println("인터넷에 연결합니다.");
	   }
	   
}
