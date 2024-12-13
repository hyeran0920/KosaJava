package ch06.sec08;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal  = new Calculator();
		
		cal.powerOn();
		
		int result1 = cal.plus(5, 6);
		System.out.println("Result1 " + result1);
		
		int x = 10;
		int y = 4;
		
		double result2 = cal.divide(x, y);
		System.out.println("Result2 " + result2);
		
		cal.powerOff();

	}

}