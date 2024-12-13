package ch18.sec07.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {
	public static void main(String[] args) throws Exception {
		String oFile1 = "C:/Temp/image1_1.png";
		String tFile1 = "C:/Temp/image1_2.png";
		String oFile2 = "C:/Temp/image2_1.png";
		String tFile2 = "C:/Temp/image2_2.png";

		//버퍼 사용 X
		FileInputStream fis = new FileInputStream(oFile1);
		FileOutputStream fos = new FileOutputStream(tFile1);
		
		
		//버퍼 사용 O
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(oFile2));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(tFile2));
		
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼 X : " + nonBufferTime + " ns" );//버퍼 X : 634170800 ns
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 O : " + bufferTime + " ns" );//버퍼 O : 12048700 ns

	}
	//자동 타입 변환으로 fis -> is , fos -> os / bis bos 도 마찬가지
	public static long copy(InputStream is, OutputStream os) throws Exception{
		long start = System.nanoTime();
		
		while (true) {
			int data = is.read(); //read()는 한번에 1바이트씩 읽음
			if(data == -1) break;
			os.write(data);
		}
		
		long end = System.nanoTime();
		
		return end - start;
	}
}
