package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class ReadExample {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");//기본생성자가 없어서 안에 파일 경로를 줘야함
			//읽은 바이트를 저장하는 배열 생성
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);//읽은 바이트 수
				if(num == -1) 
					break;
				for(int i=0; i<num; i++) {
					
					System.out.print(data[i]+" , "); //읽을수있는 양까지만 출력되도록 함
				}
				System.out.println();
				}
			
			is.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
