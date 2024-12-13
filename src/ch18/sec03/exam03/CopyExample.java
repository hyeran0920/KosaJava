package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
	public static void main(String[] args) {

		try {
		String oFileName ="C:/Temp/image1.png";
		String tFileName ="C:/Temp/image2.png";
		
			InputStream is = new FileInputStream(oFileName);
			OutputStream os= new FileOutputStream(tFileName);
			
//			byte[] data = new byte[1000]; //숫자가 클수록 메모리를 많이 잡아먹음
//			
//			while(true) {
//				int num = is.read(data);
//				
//				if(num == -1) break;
//				os.write(data, 0, num); //0~num 까지 출력
//			}
			
			is.transferTo(os);//위에 있는 코드가 9버전 이후로 이렇게 사용 가능
			
			os.flush();
			os.close();
			is.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
