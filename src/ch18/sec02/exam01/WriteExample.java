package ch18.sec02.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");//기본생성자가 없으니까 ()안에 값을 넣어줘야함
			
			byte a = 10;
			byte b = 20;
			byte c = 30;

			os.write(a); //os = fileOutputStream의 객체임
			os.write(b);
			os.write(c);
			os.flush();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {//오류나면 write할때 생긱는거임
			e.printStackTrace();
		} 

	}

}
