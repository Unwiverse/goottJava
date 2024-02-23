package goott;

/* 
 * 아래와 같이 화면에 출력을 해보자
 * 1. 
 * 			********
 * 			********
 * 			********
 * 			********
 * 
 * 2. 		*
 * 			**
 * 			***
 * 			****
 * 
 * 3. 		****
 * 			***
 * 			**
 * 			*
 */

public class ForExam_29 {

	public static void main(String[] args) {
		//1번 별찍기
		for(int i =1; i<=4; i++) { //행
			for(int j=1; j<=7; j++) { //열
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		//2번 "
		for(int i =1; i<=5; i++) {
			  for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			  System.out.println();
			  
		}
		 System.out.println();
		 //3번
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}}