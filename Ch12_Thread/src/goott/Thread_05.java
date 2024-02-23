package goott;

/*
 * [문제] 숫자(1~100)를 생성하는 스레드 클래스와 
 * 			  영문자(A~Z)를 생성하는 스레드 클래스를 각각 정의해
 * 			  정의해 스레드가 수행되게 해보자.
 * 			  - 숫자 생성 스레드 이름:NumberThread
 * 			 	==> Thread 클래스를 상속하여 생성.
 * 			  - 영문자 생성 스레드이름: AlphaThread
 * 			 	==> Runnable 인터페이스를 구현해서 생성.
 */

class NumberThread extends Thread {
	@Override
	public void run() {
		for(int i =1; i<=100; i++) {
			
			System.out.println(i);
		}
	}
}

class AlphaThread extends Thread {
	@Override
	public void run() {
		for(char a ='A'; a<='Z'; a++) {
		
			System.out.println(a);
		}
	}
}

public class Thread_05 {

	public static void main(String[] args) {
		NumberThread numberthread = new NumberThread();
		AlphaThread alphathread = new AlphaThread();
		
		numberthread.start();
		alphathread.start();

	}

}
