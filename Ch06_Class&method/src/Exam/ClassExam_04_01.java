package Exam;

import java.util.Scanner;

public class ClassExam_04_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 작업시간, 시간 당 급여 입력: ");
		ClassExam_04 temporary = 
				new ClassExam_04(sc.next(), sc.nextInt(), sc.nextInt());
		System.out.println("=============================");
		temporary.payCal();
		sc.close();
	}

}
