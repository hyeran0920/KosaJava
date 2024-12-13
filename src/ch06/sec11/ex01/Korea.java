package ch06.sec11.ex01;

public class Korea {
	static final String NATION = "대한민국";
	final String ssn; //생성자에서 값을 받아서 초기값을 설정
	
	String name;
	
	public Korea(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
}
