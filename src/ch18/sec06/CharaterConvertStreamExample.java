package ch18.sec06;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharaterConvertStreamExample {

	public static void main(String[] args) throws Exception{
		write("오늘은 월요일 입니다. 날씨가 춥네요."); //write로 갈거임
		String content = read(); //read로 갈거임
		System.out.println(content);


	}
	public static void write(String str) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		Writer writer = new OutputStreamWriter(os);
		writer.write(str); //바이트로 받은 내용을 다시 sting으로 만든다 
		writer.flush();
		writer.close();
	}

	public static String read() throws Exception{
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		Reader reader = new InputStreamReader(is);
		//보조 스트림
		BufferedReader br = new BufferedReader(reader);
		String data = br.readLine();//이 한줄로 내용 출력이 되,,,
		br.close();
		return data;
	}
}
