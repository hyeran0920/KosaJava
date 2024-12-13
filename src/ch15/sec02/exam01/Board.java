package ch15.sec02.exam01;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //모든 생성자
@NoArgsConstructor //기본 생성자
public class Board { //게시판 게시물 dto
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;
}
