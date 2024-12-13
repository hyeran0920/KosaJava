package ch12.sec03.exam04;


public class EqualsExample {
	public static void main(String[] agrs) {
		Member m1 = new Member("user1","홍길동");
		Member m2 = new Member("user1","홍길동");
		
		System.out.println(m1 == m2);
		System.out.println(m1.getId().equals(m2.getId()));
		System.out.println(m1.getName().equals(m2.getName()));
		
		if(m1.equals(m2)) {
			System.out.println("환영합니다.");
		}else {
			System.out.println("없는 회원 입니다.");
		}
	}
}
