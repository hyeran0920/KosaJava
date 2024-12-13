package ch12.sec07;

import java.util.Random;

public class MathExample {

	public static void main(String[] args) {

		double value1 = 3.7;
	
		long value2 = Math.round(value1); //반올림
		System.out.println(value2);
	
		int value3 = (int)Math.floor(value1); //내림
		System.out.println(value3);
		
		int vlaue4 = (int)Math.ceil(value1); //올림
		System.out.println(vlaue4);
		
		System.out.println(Math.random()); //0.0<=~<1.0
		System.out.println(Math.random()*6); //0.0<=~<6.0
		System.out.println((int)(Math.random()*6)); //0~5
		System.out.println((int)(Math.random()*6)+1); //1~6
	
		//Random 클래스 사용
		Random random = new Random();
		System.out.println(random.nextInt()); //정수 난수
		System.out.println(random.nextDouble()); //실수 난수
		System.out.println(random.nextInt(6)+1);//1~6
		
	}

}
