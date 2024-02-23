package goott;

/*
 * 다중 for 반복문
 * - 반복문 안에 또 다른 반복문을 포함하는 형태.
 * - 반복문이 중첩이 되어 사용되는 경우
 * - 외부 반복문과 내부 반복문 간의 변수의 값 변화에 유의할 것.
 * 
 * 		형식)
 * 				for(초기식1; 조건식 1; 증감식1;) {
 * 						반복 실행 문장;
 * 						for (초기식2; 조건식 2; 증감식2;) {
 * 								반복 실행문장;
 * }
 * }
 */

public class ForExam_27 {

	public static void main(String[] args) {
		for(int i =1; i<=3; i++) {
			for(int j =1; j <=4; j++) {
				System.out.println("["+i+", "+j+"]");
				
			}
			System.out.println();
		}

	}

}
