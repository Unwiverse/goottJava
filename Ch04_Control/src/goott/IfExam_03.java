package goott;
import java.util.Scanner;
/*
 * [문제] 키보드로 점수 하나를 입력 받아서 그 점수가
 * 		 5의 배수이면 "이 정수는 5의 배수입니다."라는
 * 		 메세지를 화면에 출력해보세요.
 */

public class IfExam_03 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//1. 키보드로 점수를 입력 받고 변수에 저장
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("점수를 입력하세요.");
		int score = sc.nextInt();
		
//		2. 조건식을 통해서 원하는 결과를 화면에 출력
		if((score%5)==1) {
			System.out.println("일의 자리가 6인 수입니다.");
			
//		if(score/6==' ');
//			System.out.println("6으로 나눴습니다.");
			}
		System.out.println("프로그램 종료");
		}
	}
			




