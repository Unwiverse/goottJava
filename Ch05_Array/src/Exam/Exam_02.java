package Exam;

import java.util.Scanner;

/*
 * 정렬 알고리즘 - 내림차순 정령
*/
public class Exam_02 {

	public static void main(String[] args) {
		//1. 키보드 준비 작업
		Scanner sc = new Scanner(System.in);
		// 2. 정수형 배열 선언 - 배열 크기 5
		int[] sort = new int[5];
		//3. 배열에 키보드로 데이터를 입력해 저장해두자.
		for(int i=0; i<sort.length; i++) {
			System.out.println((i+1)+"번째 정수 입력: ");
			sort[i] = sc.nextInt();
		}
		//4. 내림차순 정렬
		int temp = 0; //값을 저장해둘 임의의 변수
		for(int i=0; i<sort.length; i++) {
			for(int j=i+1; j<sort.length; j++) {
				if(sort[j]>sort[i]) {
					temp=sort[j]; //교차식으로 값이 이동함
					sort[j] = sort[i];
					sort[i] = temp;
					
				}
			}
		}System.out.println();
		System.out.println("***** 내림차순 정렬 *****");
		//5. 내림차순으로 정렬된 sort배열을 화면에 출력해보자.
		for(int i=0; i<sort.length; i++) {
			System.out.println(sort[i] +"\t");
			
		}sc.close();
	}

}
