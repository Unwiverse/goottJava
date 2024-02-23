package Exam;

import java.util.Scanner;

// 다차원배열의 가변배열을 이용하자.

public class Exam_06 {

	public static void main(String[] args) {
		//1.다차원 배열의 가변 배열 선언 및 메모리 할당.
		Scanner sc = new Scanner(System.in);
		System.out.println("행 배열 개수 입력: ");
		int[][] step = new int[sc.nextInt()][];
		int count=1;
		
		//2. 가변 배열의 열을 만들어주자.
//		step[0] = new int[1];
//		step[1] = new int[2];
//		step[2] = new int[3];
//		step[3] = new int[4];
//		step[4] = new int[5];
		for(int i=0; i<step.length; i++) {
			step[i] =new int[i+1];
		}
		// 3. 가변배열 에 데이터를 입력해주자
		for(int i=0; i<step.length; i++) { //행
			for(int j=0; j<step[i].length; j++) { //열 
				step[i][j]=count++;
			}
		}
	    //4. 가변 배열에 저장된 데이터를 출력해보자.
		for(int i=0; i<step.length; i++) { //행
			for(int j=0; j<step[i].length; j++) { //열 
				System.out.printf("%2d\t", step[i][j]);
			}		
			System.out.println();
			
		}sc.close();
		}
	}
