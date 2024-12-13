package ch07.sec04;

public class SuperSonicAirplane extends Airplane {

	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flymode = NOMAL;
	@Override
	public void fly() {
		if (flymode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly();
		}
	}


}
