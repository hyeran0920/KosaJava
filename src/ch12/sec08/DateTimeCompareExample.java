package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExample {

	public static void main(String[] args) {
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1,1,0,0,0);
		System.out.println("시작일 "+ startDateTime.format(dft));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12,31,0,0,0);
		System.out.println("종료일 "+ endDateTime.format(dft));
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("진행 중 입니다.");
		}else if(startDateTime.isEqual(endDateTime)){
			System.out.println("종료입니다.");
		}else if(startDateTime.isAfter(endDateTime)){
			System.out.println("종료 했습니다.");
		}
		
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth= startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDays = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHours = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond= startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 YEARS "+ remainYear);
		System.out.println("남은 MONTHS "+ remainMonth);
		System.out.println("남은 DAYS "+ remainDays);
		System.out.println("남은 HOURS "+ remainHours);
		System.out.println("남은 MINUTES "+ remainMinute);
		System.out.println("남은 SECONDS "+ remainSecond);
	}

}
