package ch06.sec09_sec10;

public class Calculator {
	//인스턴스 필드
	String color;
	int price;
	//정적 필드
	static String company = "LG"; //모든 계산기의 제조사를 LG로 선언할거기때문에 걍 정적 멤버로 선언
	static double pi = 3.14;
	
	Calculator(String color, int price){
		this.color = color;
		this.price = price;
	}
	
	//인스턴스 메소드
	double circleArea1(double radius) {
		return radius * radius * Calculator.pi;
	}
	
	//정적 메소드
	static double circleArea2(double radius) {
		return radius * radius * pi;
		//pi는 staic이기 때문에 굳이 앞에 클래스를 적지않아도된다
		
	}
}
