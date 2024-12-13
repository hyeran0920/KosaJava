package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) throws Exception {//JVM에 예외 처리넘기기
		Writer writer = new FileWriter("C:/Temp/test1.txt");
		
		String data = "오늘은 금요일입니다. 불금이지요. 주말에는 푹 쉬어도 될까요?";
		writer.write(data);
		
		writer.flush();
		writer.close();
		
	}
}
