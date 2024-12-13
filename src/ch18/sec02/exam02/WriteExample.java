package ch18.sec02.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test2.db");//기본생성자가 없으니까 ()안에 값을 넣어줘야함
			
			byte [] array = new byte[120];
		
			for(int i=0; i<array.length; i++) {
				array[i] =(byte)i;
			}
			
			os.write(array);
			os.flush();
			os.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {//오류나면 write할때 생긱는거임
			e.printStackTrace();
		} 

	}

}
