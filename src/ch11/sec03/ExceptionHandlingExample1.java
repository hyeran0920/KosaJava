package ch11.sec03;

public class ExceptionHandlingExample1 {
	   public static void printLength(String data) {
		   try {
			   int result = data.length();
			   System.out.println("문자수: " + result);			   
		   }catch (NullPointerException e) {
			   System.out.println(e.getMessage());
			   System.out.println(e.toString());
//			   e.printStackTrace();
		   }finally {
			   System.out.println("마무리 실행");
		   }
}
		   
		   public static void main(String[] args) throws Exception{
		      System.out.println("[프로그램 시작]\n");
		      
		      
		      printLength("ThisIsJava");
		      printLength(null); //NullPointerException
		      Thread.sleep(5000);//5초 동안 대기
		      System.out.println("[프로그램 종료]");
		   }
}
