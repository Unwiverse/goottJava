package goott;

import java.util.Scanner;

/*
 * 4. switch ~ case문 = 분기문(조건문)
 *     = 식(정수 또는 char)를 사용해 여러 개의 조건 중 하나를
 *     	   선택하는 명령문.
 *     = JDK 1.7버전 부터는 식에 String 사용이 가능함.
 *     
 *     형식)
 *     				switch(식 또는 값) {
 *     					case 값 1 :
 *     										값 1일때 실행문;
 *     										break; //switch~case 블럭 탈출
 *     					case 값2 :
 *     										값 2일때 실행문;
 *     										break; //switch~case 블럭 탈출
 *     					case 값 3 :
 *     										값 3일때 실행문;
 *     										break; //switch~case 블럭 탈출
 *     					default:  
 *     										값1~3 이외의 값이 들어온 경우 실행문;
 *     										// default 문장은 생략 가능.
 *     }
 */



public class SwitchCaseExam_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~3 사이의 숫자 중에서 하나를 입력하세요: ");
		int num = sc.nextInt();
		switch(num) {
		case 1 : 
			System.out.println("입력받은 숫자는 1입니다.");
			break;
		case 2 : 
			System.out.println("입력받은 숫자는 2입니다.");
			break;
		case 3 : 
			System.out.println("입력받은 숫자는 3입니다.");
			break;
		default: 
			System.out.println("1~3 이외 숫자가 입력됐습니다.");
		}
		sc.close();

	}

}
