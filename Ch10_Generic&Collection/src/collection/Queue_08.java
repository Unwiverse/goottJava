package collection;

import java.util.*;


/*
 * Queue 자료 구조
 * - queue는 인터페이스여서 자식클래스로 객체를 생성해 씀.
 * - ㄷ ㅐ표적인 클래스는 LinkedList 객체임
 * - 특징: 선입선출(FIFO: First In First Out) 구조임.
 * 
 */

public class Queue_08 {

	public static void main(String[] args) {
		
//		Queue<Integer> queue = new LinkedList<Integer>();
//		
//		//1. add(): queue에 저장하는 메소드. 예외처리 미포함 메서드
//		queue.add(3);
//		queue.add(4);
//		queue.add(5);
//
//		//element(): queue에 가장 먼저 입력된 데이터를 출력하는 메소드.
//		System.out.println(queue.element());
//		System.out.println();
//		
//		//remove(): queue에서 가장 먼저 입력된 데이터를 출력 후 제거하는 메소드
//		System.out.println(queue.remove()); //3
//		System.out.println(queue.remove()); //4
//		System.out.println(queue.remove()); //5
//		System.out.println(queue.remove()); // 실제 queue에 저장된 데이터 x
//		System.out.println();
		
		
		Queue<Integer> queue2 = new LinkedList<>();
				//offer(): queue에 저장하는 메서드. add와는 달리 예외처리 기능을 갖고있음
				queue2.offer(3);
				queue2.offer(4);
				queue2.offer(5);

				//element(): queue에 가장 먼저 입력된 데이터를 출력하는 메소드.
				System.out.println(queue2.element());
				System.out.println();
				
				//poll(): queue에서 가장 먼저 입력된 데이터를 출력 후 제거하는 메소드
				System.out.println(queue2.poll()); //3
				System.out.println(queue2.poll()); //4
				System.out.println(queue2.poll()); //5
				System.out.println(queue2.poll()); // 실제 queue에 저장된 데이터 x
	}

}
