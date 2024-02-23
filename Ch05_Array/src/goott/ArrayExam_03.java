package goott;

import java.util.Scanner;

/*
 * [문제] 내가 여행 가고 싶은 5개 나라를
 * 			  키보드로 입력받아서 배열에 저장 후 
 * 			  배열에 저장된 나라를 화면에 ㄱㄱ
 */

public class ArrayExam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nat = new String[5];
		
//		for(int i=0; i<5; i++) {
//			System.out.print((i+1)+"번째 나라: ");
//			nat[i] =sc.next();
//		} System.out.println();
//		for(int i=0; i<5; i++) {
//			System.out.println((i+1)+"번째 나라: "+nat[i]);
			
			/*
			 * 단축 for문(개선된 for문, 향상된 for문)
			 * - jdk 1.5 버전부터 추가된 기능.
			 * - 주로 배열의 요소(값)을 처리(출력)할 때 사용함.
			 * 형식) 
			 * 				for(자료형 변수명: 배열명) {
			 * 						반복실행문장;
			 * 				}
			 * 
			 * 실행문장
			 * - 배열의 첫 번째 index(0)에 있는 데이터를 좌변에 있는 
			 *   변수에 저장해서 출력.
			 * - 데이터 수만큼 자동으로 반복해 출력함.
			 * 
			 * 주의) 
			 * -우변에 있는 배열명의 자료형과 좌변에 있는 변수명의
			 * 	 자료형은 반드시 일치해야됨.
			 * -만약 일치안하면 에러 발생.
			 * 
			 */
	}		  

}
