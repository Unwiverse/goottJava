package goott;
/*
 * for 반복문
 * - 변수의 값을 이용해 반복 실행하는 반복문
 * - 일정 횟수에 대한 반복을 구현할 때 효율적으로 사용되는 반복문.
 * 	  즉, 반복문의 횟수를 알고 있을 때 자주 사용 가능.
 * 
 * 		형식) 
 * 				for(초기식; 조건식; 증감식;) {
 * 						반복 실행할 문장;
 * 				}
 * 
 * [for 반복문 실행 순서]
 * 1. 초기식: 처음에 한 번만 실행됨(변수 선언 및 초기화)
 * 2. 조건식: 조건이 참이면 반복 실행. 조건이 거짓이면 for 반복문 탈출.
 * 3. 실행문: 조건이 참일 때 반복 대상인 반복 실행문이 실행됨.
 * 4. 증감식: 변수를 대상으로 증가(++) 또는 감소(--)
 */
public class ForExam_23 {

	public static void main(String[] args) {
		//while 반복문을 이용해 1~10까지 화면에 출력.
		int i =1; //초기식
		while(i <=10) {
			System.out.println("i>>>"+i);
			i++;
		}
		System.out.println();
		
		//for 반복문을 써서 1~10까지 출력★★★★★★★
		for(int num=1; num <=10; num++) {
			System.out.println("num>>>"+num);
		}
	}

}
