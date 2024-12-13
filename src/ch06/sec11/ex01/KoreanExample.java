package ch06.sec11.ex01;

public class KoreanExample {

	public static void main(String[] args) {

		Korea k1 = new Korea("홍길동", "123454-1234567");

		System.out.println(k1.name);
		System.out.println(Korea.NATION);
		System.out.println(k1.ssn);
	}

}
