package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import model.Student;

/*
 * [문제] List_05 클래스처럼 Student 객체를 만들어서 키보드로 학생 수를 입력받고 입력받은 학생 수만큼 정보를 입력받아서 ArrayList에 저장 후 화면에
 * 출력 ㄱ
 */

public class List_06 {

	public static void main(String[] args) {
		List<Student> student = new ArrayList<>(); //ArrayList을 사용하여 학생 정보를 저장할 student 리스트를 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 su 입력: ");
		int studCount = sc.nextInt();
		sc.nextLine();
		
		//1. 키보드로 입력받은 학생 수 만큼의 학생 정보를 
		//   키보드로 입력을 받아 ArrayList에 저장하자.
		
		for(int i=0; i<studCount; i++) {
			System.out.println((i+1)+"번 째 학생의 학번, 이름, 학과, 연락처 입력: ");
			Student info = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			student.add(info);
		}
		for(int i=0; i<student.size(); i++) {
			Student dto = student.get(i);
			System.out.println(dto.getHakbun()+"\t"+dto.getStudNo()+"\t"+dto.getMajor()+"\t"+dto.getPhone());
			
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
		

	}
		sc.close();

	}
}
