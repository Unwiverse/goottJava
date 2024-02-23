package goott;

/*
 * 2. Runnable 인터페이스 구현(implement)해서 쓰는 방법
 * 		1) Runnable 인터페이스를 구현
 * 		2) run() 추상 메서드를 재정의 
 * 		3) 스레드 클래스(자식클래스) 객체 생성.
 * 		4) thread라는 클래스 객체 생성.
 * 			==> 생성자 안에 스레드 클래스(자식 클래스)의 참조변수를 기재.
 * 		5) Thread라는 클래스의 참조변수.start() 메서드 호출
 */

class Runnable1 implements Runnable {

	@Override
	public void run() {
		int i = 1;
		while(true) { //무한반복
			
			System.out.println("i: "+i);
			i++;
			
		}
		
	}
	
}

class Runnable2 implements Runnable {

	@Override
	public void run() {
			int j = 1;
			while(true) { //무한반복
				
				System.out.println("j: "+j);
				j++;
			}
	}
}

public class Thread_03 {

	public static void main(String[] args) {
		// 스레드 클래스(자식 클래스) 객체 생성.
		Runnable1 runnable1 = new Runnable1();
		Runnable2 runnable2 = new Runnable2();
		
		//thread 클래스 객체 생성
		// 생성자 안에 스레드 클래스(자식클래스)의 참조변수 기재
		Thread thread1 =new Thread(runnable1);
		Thread thread2 =new Thread(runnable2);
		thread1.start();
		thread2.start();
	}

}
