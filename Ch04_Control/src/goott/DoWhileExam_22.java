package goott;

/*
 * do ~ while 반복문
 *  - 먼저 반복 실행문을 실행하고 난 후 조건식을 비교함
 *  형식) 
 *  		do {
 *  				반복 실행 문장;
 *  			}while(조건식);
 */

public class DoWhileExam_22 {

	public static void main(String[] args) {
		// 1~ 10까지 화면에 출력해보자. - while 반목문
		int i =1; //초기식
		while(i <=10) {
			System.out.println("i>>>"+i);
			i++;
		}
		System.out.println();
		// 1~ 10까지 화면에 출력해보자. - do~while 반목문
		int num = 1;
		
		do { // while문과는 다르게 조건이 다르더라고(거짓이더라도) 최소 1번은 실행문을 동작함
			System.out.println("num>>>"+num);
			num++;
		} while(num<=10); 
	}

}
