package goott;

public class Variable_02 {

	public static void main(String[] args) {
		// 1. 변수 선언
		//int num; //int 자료형 num 변수명
		// 2. 변수 초기화
		//num = 130;
		
		// 3. 변수 선언 및 초기화 동시 진행
		int num = 130;
		
		num = num+100;
		int num2 = num; //num2라는 변수에 num 변수 값을 할당함.
		// 4. 변수 연산 또는 변수 출력
		System.out.println("num>>>"+num);
		System.out.println("num+120>>>"+num+120);
		System.out.println("num2>>>"+num2);
	}

}
