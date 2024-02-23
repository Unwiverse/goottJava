package goott;

/*
 * 프로세스(process)?
 * - 현재 CPU에 의해 처리되고있는 프로그램.
 * - 운영체제로부터 메모리를 할당받음.
 * - 자바에서는 하나의 클래스를 말함.
 */

/*
 * - 무한반복을 가진 프로세스를 실행하면
 * 	  CPU가 해당 프로세스를 놓지 않아서
 *   다음 프로세스를 실행할 수 없음.
 * - 이러한 문제점을 해결하기 위해 Thread
 * 	  라는 개념을 도입했음.
 */

class Process1 {
	void go() {
		int i = 1;
		while(true) { //무한반복
			
			System.out.println("i: "+i);
			i++;
			
		}
	}
}

class Process2 {
	void go() {
		int j = 1;
		while(true) { //무한반복
			
			System.out.println("j: "+j);
			j++;
		}
	}
}

public class Thread_01 {

	public static void main(String[] args) {
		Process1 process1 = new Process1();
		Process2 process2 = new Process2();
		
		process1.go();
		process2.go();

	}

}
