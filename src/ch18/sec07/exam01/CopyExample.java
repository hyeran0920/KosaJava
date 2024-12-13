package ch18.sec07.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyExample {
	public static void main(String[] args) {

		try {
		String oFileName ="C:/Temp/image1.png";
		String tFileName ="C:/Temp/image2.png";
		
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(oFileName));
		BufferedOutputStream bo= new BufferedOutputStream(new FileOutputStream(tFileName));
			
			byte[] data = new byte[1000]; //숫자가 클수록 메모리를 많이 잡아먹음
			
			while(true) {
				int num = bi.read(data);
				
				if(num == -1) break;
				bo.write(data, 0, num); //0~num 까지 출력
			}
			
//			is.transferTo(os);//위에 있는 코드가 9버전 이후로 이렇게 사용 가능
			
			bo.flush();
			bo.close();
			bi.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
