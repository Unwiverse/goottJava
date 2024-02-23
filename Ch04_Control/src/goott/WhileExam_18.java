package goott;

/*
 * [문제] 1~100까지 홀수 합과
 * 			 짝수 합을 구해서 화면에 보여주세요.
 */

public class WhileExam_18 {

	public static void main(String[] args) {
		// 1. 사용될 변수 선언
		int num = 1; //반복문에서의 초기식
		int oddSum =0, evenSum= 0; //홀짝 합 누적변수 
		
		while(num<=100) {	// 반복문에서의 조건식 
			if(num%2==1) {
				//참인 경우 ==> 홀수인 경우
				oddSum = oddSum+num; 
				} else {
					//거짓 ==> 짝수일 때 // num%2 != 1
					evenSum +=num; //단축배정연산자
				}
			num++; //증감식
		} //while 종료
		System.out.println("1~100까지의 홀수 합: "+oddSum);
		System.out.println("1~100까지의 짝수 합: "+evenSum);
		}
	}

