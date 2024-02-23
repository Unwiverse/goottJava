package goott;

/*
 * 멀티스레드와 스레드 이름 지정
 * - 멀티 스레드: 하나의 스레드 클래스를 대상으로
 * 							2개 이상의 스레드 객체를 생성하는 기법.
 * 
 * - 스레드 이름 지정: 멀티 스레드에서 생성한 스레드 객체에
 * 									이름을 부여하는 과정을 말함.
 * 								  형식) super(name); 
 * - 멀티 스레드는 자신의 이름을 갖고 있음.
 * - 스레드의 이름이 스레드에서 큰 역할을 하진 않지만, 만약
 * 	  디버깅을 할 때 현재 어떤 스레드가 실행되어 작업하고 있는지 확인하고자할 때 사용이 많이 됨.
 */

class ThreadA extends Thread{
	
	public ThreadA() {} //기생
	public ThreadA(String name) {
		super(name);
	} //인생
	 @Override
	public void run() {
		System.out.println(this.getName()); //getName(): 현재 run()메소드 실행중인 스레드 클래스와 이름을 가져오는 메서드.
	}
}

public class Thread_06 {

	public static void main(String[] args) {
		ThreadA t1 = new ThreadA("첫 번째 스레드");
		ThreadA t2 = new ThreadA("두 번째 스레드");
		ThreadA t3 = new ThreadA("세 번째 스레드");
		ThreadA t4 = new ThreadA("네 번째 스레드");
		ThreadA t5 = new ThreadA("다섯 번째 스레드");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
