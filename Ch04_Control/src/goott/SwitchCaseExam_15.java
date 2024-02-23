package goott;

import java.util.Scanner;

public class SwitchCaseExam_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("직급(사장/전무/부장/차장/과장/대리/사원 중 하나 고르세요: ");
		String position = sc.next();
		switch(position) {
		case "사장":
			System.out.println("사장의 월급은 1000만원입니다.");
			break;
		case "전무":
			System.out.println("전무의 월급은 800만원입니다.");
			break;
		case "부장":
			System.out.println("부장의 월급은 650만원입니다.");
			break;
		case "차장":
			System.out.println("차장의 월급은 500만원입니다.");
			break;
		case "과장":
			System.out.println("과장의 월급은 400만원입니다.");
			break;
		case "대리":
			System.out.println("대리의 월급은 300만원입니다.");
			break;
		case "사원":
			System.out.println("사원의 월급은 200만원입니다.");
			break;
		default:
			System.out.println("직급이 없습니다.");
			}
			System.out.println();
			
			//다중 if~else 문으로 처리를 해보자.
			if(position.equals("사장")) { //문자열 비교 메소드: char 변수명.equals("")
				System.out.println("사장의 월급은 1000만원입니다.");
			} else if(position.equals("전무")){
				System.out.println("전무의 월급은 800만원입니다."); 
			} else if(position.equals("부장")){
				System.out.println("부장의 월급은 650만원입니다."); 
			} else if(position.equals("차장")){
				System.out.println("차장의 월급은 500만원입니다."); 
			} else if(position.equals("과장")){
				System.out.println("과장의 월급은 400만원입니다."); 
			}else if(position.equals("대리")){
				System.out.println("대리의 월급은 300만원입니다."); 
			} else if(position.equals("사원")){
				System.out.println("사원의 월급은 200만원입니다."); 
			} else {
				System.out.println("직급이 없습니다.");
			}
			sc.close();
	}

}
