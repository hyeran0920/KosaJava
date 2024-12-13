package ch12.sec08;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DataTimeExample {

	public static void main(String[] args) {

		Date date = new Date();
		dataInfo(date);
		useCalendar();
	}
	public static void dataInfo(Date date) {
		System.out.println(date);
		System.out.println(date.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd HH:mm.ss");//날짜 출력 형식 정의
		System.out.println(sdf.format(date));
	}
	
	public static void useCalendar() {
		//캘린더 추상 클래스 -> static 메소드 써서 알아서 너네나라에 맞춰서 고치셈
		Calendar cal = Calendar.getInstance(); //getinstance가 static메소드여서 추상 클래스를 구현해줌
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DAY_OF_MONTH);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("연월일"+year+ month+ date +day);
	}
	
	public static void useLocalDateTime() {
		//LocalDateTime은 final이라 수정 불가
		LocalDateTime ldt = LocalDateTime.now(); //
	}
	
	

}
