package ch15.sec02.exam02;

public class ThreadExample {

	public static void main(String[] args) {
		//동시에 값을 저장하려고 할 때 오류나는걸 방지?
		//Vector는 대기시키기 때문에 다 저장은 함
		Thread threadA = new Thread() {
			@Override
			public void run() {
				while(true) {//무한반복
				System.out.println("A");
				try {
					Thread.sleep(100);//0.1초씩 쉬기
				} catch (InterruptedException e) {
					} 
				}
			}
		};
		Thread threadB = new Thread() {
			@Override
			public void run() {
				while(true) {//무한반복
				System.out.println("B");
				try {
					Thread.sleep(100);//0.1초씩 쉬기
				} catch (InterruptedException e) {
					} 
				}
			}
		};
		
		threadA.start();
		threadB.start();
	}

}
