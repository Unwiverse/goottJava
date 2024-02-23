package goott;

import java.util.Scanner;

/*
 * [문제] 이름과 국어점수, 영어점수, 자바점수를 키보드로 입력받아서
 * 			  아래와 같이 성적을 화면에 출력
 * 			  출력화면) 이       름: □□□
 * 							  국어점수: □□점
 * 							  영어점수: □□점
 * 							  자바점수: □□점
 * 							  총       점: □□점
 * 							  평       균: □□.□□점
 * 							  학       점: □학점
 */		   

public class IfElseExam_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next(); //스캐너로 이름 입력받을 때는 붙여쓰기
		System.out.print("국어점수:  ");
		double KorScore = sc.nextDouble();
		if (KorScore < 0) {
			System.err.println("음수는 입력 불가능합니다.");
		}
		System.out.print("영어점수:  ");
		double EngScore = sc.nextDouble();
		if (EngScore < 0) {
			System.err.println("음수는 입력 불가능합니다.");
		}
		System.out.print("자바점수:  ");
		double JScore = sc.nextDouble();
		if (JScore < 0) {
			System.err.println("음수는 입력 불가능합니다.");
		}
		System.out.println("총점: "+ (KorScore+EngScore+JScore));
		System.out.printf("평균: %.2f\n", (KorScore+EngScore+JScore)/3);
		double avrg =  (KorScore+EngScore+JScore)/3; //변수를 (위에서)미리 저장해서 쓰면 간편함, 총점=sum, 평균=avrg
		if(100 >= avrg && 90 <= avrg) {
			System.out.println("A학점입니다.");
		}else if(90 > avrg && 80 <= avrg) {
			System.out.println("B학점입니다."); 
		}else if(80 > avrg && 70 <= avrg) {
			System.out.println("C학점입니다.");
		}else if(70 > avrg && 60 <= avrg) {
			System.out.println("D학점입니다.");
		} else { // 평균이 60점 미만일 때
			if(avrg < 60) {
				System.out.println("등급 외입니다.");
			}
		}
		sc.close();
	   }

}
