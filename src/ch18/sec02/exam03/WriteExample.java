package ch18.sec02.exam03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test3.db");//기본생성자가 없으니까 ()안에 값을 넣어줘야함
			
			byte [] array = {0,10,20,30,40,50}; //이 중 10~30만 저장하고싶음

			os.write(array, 1,3); //배열 1~3까지만 저장합니다~~~
			os.flush();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {//오류나면 write할때 생긱는거임
			e.printStackTrace();
		} 

	}

}
