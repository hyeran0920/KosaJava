package ch12.sec03.exam03;


public class ToStringExample {
	public static void main(String[] args) {
		String str = "홍길동";
		System.out.println(str);//변수와 변수.toString은 똑같다
		System.out.println(str.toString());
		
		Member m1 = new Member("user1","홍길동");

		System.out.println(m1);//정의 안하면 해시코드값만 줌
		System.out.println(m1.toString());
		
	}
}
