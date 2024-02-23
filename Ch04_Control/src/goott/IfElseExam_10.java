package goott;

import java.util.Scanner;

/*
 * 다중 if~else 문 - 분기문(조건문)
 *  - 여러 개의 조건 중에 맞는 조건에 해당하는 문장을 실행하는 구조.
 *  		형식) 
 *  				if(조건식1) {
 *  						조건식 1이 참인 겨우 실행 문장;
 *  				}else {
 *  						조건식 1이 거짓인 경우 실행 문장;
 *  						if(조건식2) { 
 *  							조건식 1이 거짓이고 조건식 2가 참인 경우 실행 문장;
 *  										}else {
 *  							if(조건식3) {
 *  							조건식 1, 2가 거짓이고 조건식 3이 참인 경우 실행문장;
 *  						}  else {
 *  							조건식1, 2, 3이 모두 거짓인 경우 실행 문장;
 *  }
 *  }
 *  }
 *   ===> if(조건식1) {
 *   				조건식1이 참인 경우 실행 문장;
 *   				}else if(조건식2) {
 *   				조건식 1이 거짓이고, 조건식 2가 참인 경우 실행 문장;
 *   				}else if(조건식3) { 
 *   				조건식 1, 2가 거짓이고 조건식 3이 참인 경우 실행문장;
 *   				} else {
 *   				조건식 1, 2, 3이 모두 거짓인 경우 실행문장;
 *   } 
 */

public class IfElseExam_10 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1~3 사이의 숫자 중에서 하나를 입력하세요: ");
			int num = sc.nextInt();
			if(num==1) {
				System.out.println("입력 받은 숫자는 1입니다");
			}else if(num==2) {
				System.out.println("입력받은 숫자는 2입니다");
			}else if(num==3) {
				System.out.println("입력받은 숫자는 3입니다");
			}else {
				System.out.println("1~3 이외 숫자가 입력됐습니다");
			} // 파이썬에서 하던 elif과 동일
			sc.close();
	}

}
