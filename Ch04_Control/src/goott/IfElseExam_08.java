package goott;
import java.util.Scanner;
/*
 * [문제2] 키보드로부터 입력받은 정수가 홀수인지 짝수인지 판별해서
 * 				화면에 출력.
 */

public class IfElseExam_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		long num = sc.nextInt();
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		sc.close();
	}

}
