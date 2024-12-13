package ch07.sec04;

public class SuperSonicAirplaneExample {
	public static void main(String[] args) {

		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.tackoff();
		sa.fly();
		sa.flymode = SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymode = SuperSonicAirplane.NOMAL;
		sa.fly();
		sa.land();

	}
}
