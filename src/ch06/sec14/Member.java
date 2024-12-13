package ch06.sec14;

public class Member {
	private String id;
	private String email;
	private String name;
	private int age;
	private boolean adult;
	private String ssn;

	//값을 못바꿈
	public String getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String getSsn() {
		return ssn.substring(0, 7);
	}
	public boolean isAdult() {
		return adult;
	}
	
	
	//값을 바꿀수있음
	public void setId(String id) {
		this.id = id;
	}
	
	public void setAge(int age) {
		if(age<0) {
			this.age =0;
		}else if(age > 150) {
			this.age = 150;
		}
		else {
			this.age = age;
		}
	}
}
