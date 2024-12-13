package ch15.sec02.exam02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import ch15.sec02.exam01.Board;

public class ArrayListVsVectorExample {

	public static void main(String[] args) {

//		List<Board> list = new ArrayList<>();//ArrayList는 2 스레드가 동시에 작업하는 경우 값이 소실됨
		List<Board> list = new Vector<>(); //Vector는 1개 처리 / 1개 대기 하기때문에 소실값이 없다
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=10000; i++) {
					list.add(new Board(i,"제목"+i,"내용"+i,"글쓴이"+i, new Date()));			
				}
			}
				
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=10001; i<=20000; i++) {
					list.add(new Board(i,"제목"+i,"내용"+i,"글쓴이"+i, new Date()));			
				}
			}
		};
		
		//스레드 작업 시작
		threadA.start();
		threadB.start();
		
		//스레드가 작업이 끝날때까지 기다림
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
		}
	
		//다 하고 리스트에 몇개 저장되었는
		System.out.println(list.size());

	}
	

}
