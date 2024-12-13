package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {

		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db");//기본생성자가 없어서 안에 파일 경로를 줘야함
			
			while(true) {
				int data = is.read();
				if(data == -1) 
					break;
					System.out.println(data);
				}
			
			is.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
