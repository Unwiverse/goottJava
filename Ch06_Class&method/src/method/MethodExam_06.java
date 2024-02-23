package method;

import java.util.Scanner;

//콘솔 창에서 간단한 계산기 예제
public class MethodExam_06 {
	public static void plus(int num1, int num2) {
		System.out.println("두 수의 합: "+((num1)+(num2)));
	}
	public static void minus(int num1,int num2) {
		System.out.println("두 수의 차: "+((num1)-(num2)));
	}
	public static void pios(int num1, int num2) {
		System.out.println("두 수의 곱: "+((num1)*(num2)));
	}
	public static void  division(int num1,int num2) {
		System.out.println("두 수의 나누기: "+((num1)/(num2)));
	}
	public static void other(int num1, int num2) {
		System.out.println("두 수의 나눈 나머지: "+((num1)%(num2)));
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 키보드로 두 개의 정수와 연산자로 입력을 받자.
		System.out.println("첫 번째 정수 입력: ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수 입력: ");
		int num2 = sc.nextInt();
		
		System.out.println("연산자(+, -, *, %, /) 중 하나를 입력: " );
		String op = sc.next();
		
		//2. 연산자 변수에 입력된 연산기호로 해당 기호에 맞는 메소드를 호출해 주자.
		switch(op) {
		case "+" : 
			plus(num1, num2); 
			break;
		case "-" : 
			minus(num1, num2);
			break;
		case "*" :
			pios(num1, num2);
			break;
		case "/" :
			division(num1, num2);
			break;
		case "%": 
			other(num1, num2);
			break;
		default:
			System.out.println("계산 불가");
			break;
			
		}sc.close();
	}

}
