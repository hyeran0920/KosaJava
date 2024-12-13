package ch12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {

		Integer obj = 100;
		System.out.println("Boxing " + obj);
		
		int value = obj;
		System.out.println("Unboxing " + value);
		
		int result = obj + value;
		System.out.println("result "+ result);
		
		method(3.5);
	}
	
	public static void method(Object obj) {
		System.out.println(obj);
	}

}
