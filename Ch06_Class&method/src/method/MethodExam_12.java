package method;

import java.util.Scanner;

public class MethodExam_12 {
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
