package method;

import java.util.Scanner;

/*
 * 성적 처리 프로그램
 * main() 메서드에서는 키보드로 이름, 국어점수, 영어점수, 수학점수를
 * 입력을 받고 총점 메서드, 평균 메서드, 학점 메서드를 호출해
 * 성적을 처리하고 화면에 결과 출력
 */

public class MethodExam_10 {
	public static int total(int k, int e, int m) {
		return k+e+m;
	}
	public static double average(int tot) {
		return tot / 3.0;
	}
	public static String hakjum(double avg) {
		String grade; //null
		if (avg >= 90) {
			grade = "A학점";
		} else if(avg>=80) {
			grade = "B학점";
		} else if(avg>=70) {
			grade = "C학점";
		} else if(avg>=60) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}
		return grade;
	}
	

	public static void main(String[] args) {
		//1. 메인 메서드에서는 이름, 국어점수, 영어점수, 수학 점수를 키보드로 입력만 받자
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("학생 이름 입력: ");
		String name = sc.next();
		
		System.out.println("국어점수 입력: ");
		int kor = sc.nextInt();
		
		System.out.println("영어점수 입력: ");
		int eng = sc.nextInt();
		
		System.out.println("수학점수 입력: ");
		int mat = sc.nextInt();
		
		System.out.println();
		//2. 총점을 구하자. 메서드 호출 
		int sum = total(kor, eng, mat);
		//3. 평균을 구하자. 메서드 호출
		double avg = average(sum);
		//4. 학점을 구하자. 메서드 호출
		String hakjum = hakjum(avg);
		//5. 성적 결과를 출력해보자.
		System.out.println("이름: "+name);
		System.out.println("국어점수 :"+kor);
		System.out.println("영어점수 :"+eng);
		System.out.println("수학점수 :"+mat);
		System.out.println("총점 :"+sum);
		System.out.printf("평균: %.2f점\n", avg);
		System.out.println("학점: "+hakjum);
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println();
		
		//계속 진행할지 종료할지 여부를 학인해야함.
		System.out.println("계속 진행할까요?(Y or N) : ");
		String res = sc.next();
		if(res.equals("N")) {
			break;
		}
		
	}
	System.out.println("고생하셨습니다.");
	}
}