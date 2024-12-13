package ch15.sec04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import lombok.val;

public class MapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		map.put("자바", 85);
		map.put("자바", 90);//키 값이 같으면 저장되지않음
		map.put("자스", 90);
		map.put("스프링", 75);
		map.put("데베", 95);
		
		System.out.println(map.size());
		System.out.println();
		
		//객체 검색
		int value = map.get("스프링"); //키를 입력하면 값을 돌려준다
		System.out.println(value);
		System.out.println();
	
		//반복 처리
//		for(         :map) {//이건 안됨
		for(Entry<String, Integer> entry:map.entrySet()) {
			String key = entry.getKey();
			value = entry.getValue();
			System.out.println(key + value);
		}
		System.out.println();
		
		for(String key : map.keySet()) {//키값을 가져올거니까 키를 반복문 돌림
			value = map.get(key);
			System.out.println(key + value);
		}
		
		
		//객체 삭제
		map.remove("자바");//키를 주고 삭제 시킴
		System.out.println(map);
	
	}

}
