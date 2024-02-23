package classes;

import java.util.Scanner;

public class Student_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 학번, 이름, 학과, 연락처, 주소를 넣으세요: ");
		Student student = new Student(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next());
		
		student.getStudentInfo(); 
		sc.close();
			
		
	

}
}