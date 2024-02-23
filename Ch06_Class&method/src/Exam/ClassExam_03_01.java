package Exam;

import java.util.Scanner;

public class ClassExam_03_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 전번, 주소, 직급 입력: ");
		ClassExam_03 card = new ClassExam_03(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
		// 메소드 즐겨찾기 참고
		System.out.println("======================");
		card.getCardInfo();
		sc.close();
	}

}
