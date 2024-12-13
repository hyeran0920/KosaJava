package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);
		
		System.out.print("X값 입력 : ");
		String strX = scan.nextLine();
		int x = Integer.parseInt(strX);

		System.out.print("Y값 입력 : ");
		String strY = scan.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x+y;
		System.out.println("x+y : "+ result);
		
		System.out.println("종료");
	
	}

}
