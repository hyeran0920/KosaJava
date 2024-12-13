package ch08.sec11.exam02;

public class BoardController {
	private MemberService memberService;
	private BoardService boardService;

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}
	public void request1() {
		memberService.join();
		memberService.login();
	}
	public void request2() {
		boardService.write();
		boardService.read();
	}
}
