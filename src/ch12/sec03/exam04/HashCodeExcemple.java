package ch12.sec03.exam04;

import java.util.HashSet;

import ch12.sec03.exam02.Member;

public class HashCodeExcemple {

	public static void main(String[] args) {
		Member m1 = new Member("user1","홍길동");
		Member m2 = new Member("user1","홍길동");
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m1.id.equals(m2.id));
		System.out.println(m1.name.equals(m2.name));
		
		HashSet<Member> hashSet = new HashSet<Member>();
		hashSet.add(m1);
		hashSet.add(m2);
		System.out.println("집합의 요소 수"+hashSet.size());

	}

}
