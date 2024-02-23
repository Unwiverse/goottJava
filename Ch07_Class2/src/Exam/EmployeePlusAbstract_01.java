package Exam;

import java.util.*;

public class EmployeePlusAbstract_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태 선택(P or T): ");
		String port = sc.next();
		if(port.equalsIgnoreCase("P")) {
			System.out.println("이름, 기본급, 보너스를 입력: ");
			PermanentPlusAbstract permanentplusabstract = new PermanentPlusAbstract(sc.next(), sc.nextInt(), sc.nextInt());
			System.out.println("=======================");
			System.out.println("고용형태: 정규직");
			System.out.println("이름: "+permanentplusabstract.getName());
			System.out.println("급여: "+permanentplusabstract.getPays());
		}	else if(port.equalsIgnoreCase("T")) {
			System.out.println("이름, 작업시간, 시간당 급여 입력: ");
			TemporaryPlusAbstract temporaryplusabstract = new TemporaryPlusAbstract(sc.next(), sc.nextInt(), sc.nextInt());
			System.out.println("=======================");
			System.out.println("고용형태: 임시직");
			System.out.println("이름: "+temporaryplusabstract.getName());
			System.out.println("급여: "+temporaryplusabstract.getPays()); 
			} else {
			System.err.println("잘못된 입력");
		}
		sc.close();

	}
	

}
