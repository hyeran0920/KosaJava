package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		
		//문자열 -> 기본 타입
		int var1= Integer.parseInt("10");
		double var2= Double.parseDouble("3.14");
		boolean var3= Boolean.parseBoolean("true");
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);

		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}

}
