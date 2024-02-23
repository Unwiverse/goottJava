package goott;

import java.util.Scanner;

public class IfExam_02 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		//1. 키보드로 점수를 입력 받고 변수에 저장
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		
		//2. 조건식을 통해서 원하는 결과를 화면에 출력
		if(score >= 90) {
			System.out.println("점수가 90점 넘습니다.");
			System.out.println("학점: A");
			
		}
		
		System.out.println("프로그램 종료");
		sc.close();

	}

}
