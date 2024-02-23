package goott;

/*
 * 연산: 주어진 식을 계산하여 결과를 얻는 과정.
 * 
 * 피연산자: 연산자의 작업 대상.
 * (예: 20+10 ==> 연산자=+, 피연산자:20, 10
 * 
 * java에서 연산자의 종류
 * - 산술연산자
 * - 관계연산자(비교연산자)
 * - 논리연산자(boolean)
 * - 단항연산자 / 상항연산자 
 * - 배정연산자 / 단축배정연산자
 * - 비트연산자
 * - 쉬프트연산자
 */ 
/*
 * 1. 산술연산자
 * 	  +, -, *, /, %(나머지)
 */

public class Operator_01 {

	public static void main(String[] args) {
		int su1 = 13, su2= 4; //실행한 결과에서 값을 입력받길 권장
		// 덧셈
		System.out.println("덧셈>>>"+(su1+su2));
		System.out.println(); //빈 줄 하나가 생김
		// 뺄셈
		System.out.println("뺄셈>>>"+(su1-su2));
		// 곱셈
		System.out.println("곱셈>>>"+(su1*su2));
		// 나눗셈
		System.out.println("나눗셈>>>"+(su1/su2)); // 몫이 나옴
		// 나머지 연산
		System.out.println("나눈 나머지>>>"+(su1%su2)); 
		/*
		 * % 연산자
		 * - 나머지를 구하는 연산자,
		 * = 홀 짝 판별 시 씀.
		 * - 배수 판별 시에도 씀.
		 */
	}

}
