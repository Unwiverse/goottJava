package Exam;

import java.util.Scanner;

public class Second_Exam_03 {

	public static void main(String[] args) {
//		for(int i=1; i<=6; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//				System.out.println();
//			}
//		for(int k=5; k>=1; k--) {
//			for(int l=1; l<=k; l++) {
//				System.out.print("*");
//			}
//				System.out.println();
//		}
		//다른 방법
		Scanner sc = new Scanner(System.in);
		System.out.print("별의 최대 개수를 입력하세요: ");
		
		int starCount = sc.nextInt();
		int line; // 별을 찍을 라인 수
		// 전체 라인 수 --> (입력받은 최대 별의 수 *2) -1
		for(int i=1; i<=(starCount*2)-1; i++) {
			line = (i<=starCount) ? i : (starCount*2) -i;
			for(int j =1; j<=line; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
}


