package ch08.sec11.ex01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.tire1 = new KumhoTire();
		myCar.run();
		
		myCar.tire2 = new KumhoTire();
		myCar.run();
	}

}
