package ch06.sec09_sec10;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator cal1 = new Calculator("흰색", 10000);
		Calculator cal2 = new Calculator("검정", 200000);
		
		System.out.println(cal1.color);
		System.out.println(cal1.price);
		System.out.println(cal1.circleArea1(0));
		
		System.out.println(cal2.color);
		System.out.println(cal2.price);
		
		System.out.println(Calculator.company);
		System.out.println(Calculator.circleArea2(20));//static이기때문에 클래스로 불러옴
		
		
	}

}
