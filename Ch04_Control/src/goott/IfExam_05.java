package goott;
/*
 * [문제] 키보드로부터 입력받은 점수가 60점 이상이면 
 * '합격입니다' 이라는 문자열을 메세지를 출력해보세요.
 */

import java.util.Scanner;

public class IfExam_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		if(score >=60) {
			System.out.println("합격");
		}
		if(score <=59) {
			System.out.println("불합격");
		}
		sc.close();
		}
	}
