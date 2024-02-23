package goott;

import java.util.Scanner;

public class Operator_04 {

	public static void main(String[] args) {
		
		// 1. 키보드로 데이터를 입력받는 방법(세번째)
		// Ststem.in: 표준 입력 장치(키보드)
		
		Scanner sc = new Scanner(System.in); //콘솔 창에 숫자 입력
		
		System.out.print("첫 번째 숫자 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력: ");
		int num2 = sc.nextInt();
				
		System.out.println("덧셈>>>"+(num1+num2));
		System.out.println("뺄셈>>>"+(num1-num2));
		// 곱셈
		System.out.println("곱셈>>>"+(num1*num2));
		// 나눗셈
		System.out.println("나눗셈>>>"+(num1/num2)); // 몫이 나옴
		// 나머지 연산
		System.out.println("나눈 나머지>>>"+(num1%num2));
		sc.close(); // 스캐너 종료

	}

}
