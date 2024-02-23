package goott;
import java.util.Scanner;
/*
 * if~else 문 - 분기문(조건문)
 * - 조건식이 참이면 참일 때의 실행문을 동작하고
 * if~else 문을 빠져나옴.
 * - 조건식이 거짓이면 거짓일 때의 실행문을 동작하고
 * if~else 문을 나옴.
 * 		형식) 
 * 					if(조건식) {
 * 							조건식이 참인 경우 실행 문장;
 * 					}
 * 						else {
 * 								조건식이 거짓인 경우 실행 문장;
 * 								}
 */

public class IfElseExam_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 하나를 입력하세요: ");
		int su = sc.nextInt();
		if(su >=50) {
			System.out.println("입력 받은 "+su+"는 50 이상의 점수입니다.");
		}
		else {
			System.out.println("입력 받은 "+su+"는 50 미만의 점수입니다.");
		}
		sc.close();
	}

}
