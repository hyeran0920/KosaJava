package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {

	   public static void main(String[] args) {
		      String regExp = "(02|010)-\\d{3,4}-\\d{4}"; //조건 \d는 숫자{갯수}
		      String data = "011-123-4567";
		      
		      //데이터가 형식에 맞는지 검사하는 코드
		      boolean result = Pattern.matches(regExp, data);//객체new안하기 때문에 정적 메소드
		      
		      if(result) {
		         System.out.println("정규식과 일치합니다.");
		      } else {
		         System.out.println("정규식과 일치하지 않습니다.");
		      }
		      
		      regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";// \w알파벳 + 한개이상 ?은 괄호안에 넣어도되고 안넣어도 되고
		      data = "angel@naver.com";
		      result = Pattern.matches(regExp, data);
		      if(result) {
		         System.out.println("정규식과 일치합니다.");
		      } else {
		         System.out.println("정규식과 일치하지 않습니다.");
		      }
		   }

}
