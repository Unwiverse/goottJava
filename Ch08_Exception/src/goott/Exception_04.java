package goott;

/*
 * 예외처리 
 * - 실행하는 단계에서 발생한 오류(예외)를 프로그램안에서 처리한다는 의미.
 * - 관련 키워드
 * 1. try ~ catch ~ finally 블럭
 * 2. throws 키워드
 */
/*
 * 1. try ~ catch ~ finally 블럭
 * 		형식)
 * 			try {
 * 					예외가 발생할 가능성이 있는 코드;
 * 					}catch(예외클래스 참조변수) {
 * 							예외가 발생한 경우 실행되는 코드;
 * 							참조변수: 체외와 관련된 정보를 넘겨받는 변수.
 * 					} finally {
 * 						//생략이 가능
 * 						예외와 상관없이 실행되야 하는 코드;
 * 					}
 * 
 * 
 */

public class Exception_04 {

	public static void main(String[] args) {
		 //10은 0으로 못나눔 ==> 예외처리
			System.out.println("프로그램 시작");
			int num = 10, num2 = 0; 
			int result = 0;
			try {
			result = num/num2;
			} catch(Exception e) {
				System.out.println("0으로 나눈 예외 발생");
				System.out.println("예외 정보 발생: "+e);
			}
			System.out.println("프로그램 종료");
				
	

		}
	}
