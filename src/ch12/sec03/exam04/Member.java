package ch12.sec03.exam04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //롬복
@AllArgsConstructor //모든 필드를 초기화하는 생성자
@NoArgsConstructor //기본생성자
public class Member {

	private String id;
	private String name;
	
}

