package Exam;

import java.util.Scanner;

public class ClassExam_01_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 성별(male/female), 나이를 입력하세요: ");
		ClassExam_01 classexam = new ClassExam_01(sc.next(), sc.next(), sc.nextInt());
		
		classexam.getPersonInfo();
		sc.close();

	}

}
