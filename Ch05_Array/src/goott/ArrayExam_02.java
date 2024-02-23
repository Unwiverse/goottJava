package goott;

import java.util.Scanner;

/*
 * 5개의 정수를 저장할 배열을 만들고 키보드로 배열에 
 * 5개의 데이터를 저장 후 해당 배열을 화면에 출력해 보자.
 */

public class ArrayExam_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1, 배열의 1단계 + 2단계: 배열선언 + 배열 메모리 생성.
		int[] score = new int[5];
//		System.out.println("첫 번째 정수 입력: ");
//		score[0] = sc.nextInt();
//		
//		System.out.println("두 번째 정수 입력: ");
//		score[1] = sc.nextInt();
//		
//		System.out.println("세 번째 정수 입력: ");
//		score[2] = sc.nextInt();
//		
//		System.out.println("네 번째 정수 입력: ");
//		score[3] = sc.nextInt();
//		
//		System.out.println("다섯 번째 정수 입력: ");
//		score[4] = sc.nextInt();
		
		//반복문 사용
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+ "번째 정수 입력: ");
			score[i] = sc.nextInt();
			System.out.println("입력받은 정수: "+score[i]);
		} 
		sc.close();
	}

}
