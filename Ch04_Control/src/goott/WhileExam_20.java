package goott;

import java.util.Scanner;

/* 
 * 1~100사이의 정수 중에서 키보드로 5개의 정수를 입력받아
 * 5개의 정수 중에서 최대값을 화면에 보여주세요.
 * (예: 43, 17, 64, 98, 11)
 */

public class WhileExam_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0; //최대값이 저장될 변수
		int temp = 0, i = 1;
		while(i <= 5) {
			System.out.print(i +"번 째 정수 입력: ");
			temp =sc.nextInt();
			if(temp> max) {
				max = temp; //참이면 max 변수에 temp 값 저장;
			} i++;
		}	System.out.println("최대값: "+max);
			sc.close();
		

	}

}
