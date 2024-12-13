package ch02.sec07_sec10;

public class TypeChangeExample {

	public static void main(String[] args) {
		
		int var1 = 100;
		byte var2 = (byte) var1; //int 4 byte 1 이라서 (byte)로 강제타입변환해야한다
		//byte 범위가 -127~127이기 때문에 강제타입변환시 값이 유지되려면 byte값 범위에 int값이 있어야한다
		
		//자동 타입 변환
		byte var3 = 100;
		int var4 = var3;
		
		//강제 타입 변환
		long var5 = 200;
		int var6 = (short)var3;
		
		//실수 -> 정수
		double var7 = 3.14;
		int var8 = (int) var7;
		
		
		float var9 = 3.14f;
		long var10 = (long)var9;
		
		//타입에 따라 메모리 크기가 달라 저장되는값이 다르다
		//따라서 잘 보고 형변환 해야한다~~~
		
		//정수 -> 실수
		int var11 = 3;
		double var12 = var9;
		
		//연산식에서 타입 변환
		byte var13 = 10;
		byte var14 = 20;
//		byte var15 = var13+var14;// 산술연산시 int 로 바뀌므로 강제타입변환을 해줘야한다.
		byte var15 = (byte) (var13+var14); //아니면 int로 걍 타입 선언 ㄱㄱ
		
		
		
		
	}

}
