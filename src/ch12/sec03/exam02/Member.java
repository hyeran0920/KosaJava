package ch12.sec03.exam02;


public class Member {

	public String id;
	public String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name= name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode() + name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {//입력값이 멤버안에 있는지 확인
		Member target = (Member) obj; // 강제 타입 변환
		return id.equals(target.id) && name.equals(target.name);
		}else {
			return false;
		}
	}
}

