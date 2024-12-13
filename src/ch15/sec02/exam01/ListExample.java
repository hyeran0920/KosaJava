package ch15.sec02.exam01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {

		List<Board> list = new ArrayList<Board>(); // 리스트 안에 Board 객체가 저장
//		List<Board> list = new Vector<>(); 
//		List<Board> list = new LinkedList<>();
		
		//객체 추가
		for(int i=1; i<=5; i++) {
			list.add(new Board(i,"제목"+i,"내용"+i,"글쓴이"+i, new Date()));			
		}
		
		list.add(1, new Board(6,"제목6","내용6","글쓴이6", new Date()));					
		list.set(2, new Board(7,"제목7","내용7","글쓴이7", new Date()));					
		
		
		//객체 검색
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));//list는 리스트가 아니라서 list[i]가 안된다
		}
		System.out.println();
		//향상된 for문
		for(Board board : list) {
			System.out.println(board);
		}
		System.out.println();
		
		Board board = list.get(1);
		System.out.println(board.getBno() + "!");
		System.out.println(board.getTitle() + "!");
		System.out.println(board.getContent() + "!");
		System.out.println(board.getWriter() + "!");
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-DD");
		System.out.println(sdf.format(board.getDate()));

		System.out.println();
		//객체 삭제
		list.remove(0); //인덱스 0 삭제
		list.remove(board); //인덱스 1 삭제
		list.clear(); //인덱스 전체 삭제
		
		System.out.println(list.size());
		
	}

}
