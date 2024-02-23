package Object;

import java.util.Scanner;

public class Student_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 학번, 학과, 전번, 주소 입력: ");
		Student std = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
		//학생 정보 출력
		System.out.println(std.toString()); //자동 생성(오버라이드)된 기본 생성자 사용 호출
		sc.close();
	}
	

}
