package Exam;

import java.util.Scanner; 

public class Employee_01 { //해당 클래스는 부모와 자식 클래스 동작에 필요한 값을 입력받고 객체를 생성하고 제어문과 출력문을 작성하는 곳임을 밝힙니다.

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Temporary temporary = new Temporary();
//		Permanent permanent = new Permanent();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태(P or T) 입력: ");
		String pt = sc.next();
		if(pt.equalsIgnoreCase("P")) {
			System.out.println("이름, 기본급, 보너스 입력: ");
			Permanent permanent = new Permanent(sc.next(), sc.nextInt(), sc.nextInt());
			System.out.println(":::::::::::::::::::::::::::::::::::::");
			System.out.println("고용형태: 정규직");
			System.out.println("이름: "+permanent.getName());
			System.out.printf("급여: %,d\n", permanent.getPays());
		} else if (pt.equalsIgnoreCase("T")) { //이 메서드는 두 개의 문자열을 비교하여 대소문자의 차이를 무시하고 같은지를 확인
			System.out.println("이름, 기본급, 보너스 입력: ");
			Temporary temporary = new Temporary(sc.next(), sc.nextInt(), sc.nextInt());
			System.out.println(":::::::::::::::::::::::::::::::::::::");
			System.out.println("고용형태: 임시직");
			System.out.println("이름: "+temporary.getName());
			System.out.printf("급여: %,d\n", temporary.getPays());
		} else {
			System.err.println("잘못된 입력");
		}
		sc.close();
	}
	
	

}
