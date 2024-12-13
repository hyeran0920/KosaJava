package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListExample {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		//실행시작시간
		startTime = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		
		
		//실행끝난시간
		endTime = System.nanoTime();
		
		long time = endTime - startTime;
		System.out.println("list1 "+time+"ns");
		
		//--------------------------
		
		//실행시작시간
		startTime = System.nanoTime();
		
		for(int i=0; i<10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		
		
		//실행끝난시간
		endTime = System.nanoTime();
		time = endTime-startTime;
		System.out.println("list2 "+time+"ns");
		
		
		
	}

}
