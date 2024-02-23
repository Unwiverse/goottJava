package Exam;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next(); //스캐너로 이름 입력받을 때는 붙여쓰기
		System.out.print("국어점수:  ");
		double KorScore = sc.nextDouble();
		if (KorScore < 0) {
		System.err.println("음수는 입력 불가능합니다. 재시작 후 입력해주세요.");
		}
		System.out.print("영어점수:  ");
		double EngScore = sc.nextDouble();
		if (EngScore < 0) {
		System.err.println("음수는 입력 불가능합니다. 재시작 후 입력해주세요.");
		}
		System.out.print("수학점수:  ");
		double MatScore = sc.nextDouble();
		if (MatScore < 0) {
		System.err.println("음수는 입력 불가능합니다. 재시작 후 입력해주세요.");
		}
		System.out.print("자바점수:  ");
		double JScore = sc.nextDouble();
		if (JScore < 0) {
		System.err.println("음수는 입력 불가능합니다. 재시작 후 입력해주세요.");
		}
		double Sum = KorScore+EngScore+MatScore+JScore;
//		System.out.println("국어점수:  "+KorScore);
//		System.out.println("영어점수:  "+EngScore);
//		System.out.println("수학점수:  "+MatScore);
//		System.out.println("자바점수:  "+JScore);
		System.out.println("총점: "+ Sum);
		System.out.printf("평균: %.2f\n", (Sum/4));
		sc.close();
	   }

}