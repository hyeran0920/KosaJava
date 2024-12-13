package ch12.sec06;

public class WrapperClassExample {

	public static void main(String[] args) {

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		Integer obj = 3;
		Integer obj1 = Integer.parseInt("3"); //3
		Integer obj2 = Integer.valueOf(3);
		
		Double obj3 = 3.5;
		Double obj4 = Double.parseDouble("3.5");//3.5
		Double obj5 = Double.valueOf("3.5");
		
		int value1 = 3;
		Integer obj6 = 3;
		System.out.println(value1 == obj6);//true 비교할땐 자동 언박싱된다
	}

}
