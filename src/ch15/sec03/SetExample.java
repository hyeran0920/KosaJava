package ch15.sec03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<>();
		
		Member m1 = new Member("홍길동", 25);
//		Member m2 = new Member("홍길동", 25); //같은 내용 두번저장하면 같은객체라고 취급함
		Member m2 = new Member("김자바", 25);

		//객체 저장
		set.add(m1);
		set.add(m2);
		System.out.println(set.size());
		
		//객체 삭제
//		set.remove(m2);//같은 주소를 찾아서 삭제하는게 아니라 동등객체를 찾아서 삭제
		System.out.println(set.size());
		
		//객체 검색 - 콕 찝어서 가져오라는게 없고 전체에서 하나씩 처리해야함
		for(Member m : set) {
			System.out.println(m);
		}
		
		//얘도 객체 검색
		Iterator<Member> iterator = set.iterator();//객체를 가져오거나 제거하기 위해 사용
		while (iterator.hasNext()) {
			Member m = iterator.next(); //가져올게 있으면 가져와
			
		}
	
	}

}
