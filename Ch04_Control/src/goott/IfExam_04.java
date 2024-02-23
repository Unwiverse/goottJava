package goott;

import java.util.Scanner;

/*
 * [문제] 키보드로 입력 받은 정수 값이 음수면
 * '입력받은 정수는 음수입니다.' 라는 메세지를 화면에 출력 
 */

public class IfExam_04 {

	public static void main(String[] args)  {
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			int score = sc.nextInt();
			if(score <0) {
				System.out.println("음수임");
			} // if 문 조건에 맞지 않을 경우 무시
			if(score >0) {
			System.out.println("양수임");
			}		
			sc.close();
			System.out.println("종료");
			}
	}