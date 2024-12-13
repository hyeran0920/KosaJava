package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test1.txt");
		
		char[] array = new char[1000];
		
		while(true) {
			int num = reader.read(array);
			if(num == -1)break;
			String data = new String(array, 0, num);
			System.out.println(data);
		}
	}
}
