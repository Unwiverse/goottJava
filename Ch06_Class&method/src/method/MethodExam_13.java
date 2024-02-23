package method;

/*
 * 메서드 다중정의(Method Overloading)
 * - 동일한 클래스에서 동일한 이름의 메서드가 여러개
 * 	  정의되는 자바 문법.
 * - 일관된 이름으로 정의할 수 있어서 개발자(사용자)에게 코드의 직관성을 제공함.
 * 
 * [메서드 다중정의 규칙]
 * 1. 메서드 이름이 동일해야 함.
 * 2. 매개변수의 갯수가 같은 경우에는 매개변수의 자료형이 달라야 함. 또는 매개변수의 개수가 달라야함.
 * 3. 리턴타입(반환형)은 무관함.
 */

import java.util.Scanner;

public class MethodExam_13 {
	public static int sum2(int k, int e) {
		return k+e;
	}
	public static int sum3(int k, int e, int j) {
		return k+e+j;
	}
	public static int sum4(int k, int e, int j, int p) {
		return k+e+j+p;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 입력: ");
		int kor = sc.nextInt();
		
		System.out.println("영어점수 입력: ");
		int eng = sc.nextInt();
		
		System.out.println("수학점수 입력: ");
		int mat = sc.nextInt();
		
		System.out.println("자바점수 입력: ");
		int java = sc.nextInt();
		
		System.out.println("2과목 총점: "+sum2(kor, eng));
		System.out.println("3과목 총점: "+sum3(kor, eng, mat));
		System.out.println("4과목 총점: "+sum4(kor, eng, mat, java));
		sc.close();

	}

}
