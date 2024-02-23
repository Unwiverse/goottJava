package Exam;

import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력하세요: ");
		int num= sc.nextInt();
		
//		if(num >0) {
//			System.out.println("입력받은 정수는: "+num);
//			// 3 -1. 입력받은 정수의 제곱을 구하자.
//			System.out.println(num+"의 제곱:"+(num*num));
//			// 3-2. 입력받은 정수의 세제곱을 구하자.
//			System.out.println(num+"의 제곱:"+(num*num*num));
//			
//		} else {
//			System.out.println("양수 입력");
//		}
		
		System.out.println("입력받은 정수: "+num);
		System.out.println("제곱>>>"+(num*num)); //num
		System.out.println("세제곱>>>"+(num*num*num));
		sc.close();
	}


}
