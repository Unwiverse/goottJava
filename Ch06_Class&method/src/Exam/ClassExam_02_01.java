package Exam;

import java.util.Scanner;

public class ClassExam_02_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형의 가로, 세로를 입력하세요: ");
		ClassExam_02 rectangle = new ClassExam_02(sc.nextInt(), sc.nextInt());
		
		rectangle.multiply(); //메서드 호출
		sc.close();
	}

}
