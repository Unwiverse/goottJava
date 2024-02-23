package goott;
// 3번 클래스 간소화 방법 예제

/*
 * 무명 클래스(annonymous class)를 이용한 스레드 생성.
 * - 코드의 집중화로 가독성 up
 * - 별도의 상속 과정이 필요없다
 */
public class Thread_04 {

	public static void main(String[] args) {
		new Thread() { //객체
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int i = 1;
				while(true) { //무한반복
					
					System.out.println("i: "+i);
					i++;
				}
			}
		

		}.start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				int j = 1;
				while(true) { //무한반복
					
					System.out.println("j: "+j);
					j++;
				}
				
			}
		}).start();
	}
}
