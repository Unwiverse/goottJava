package goott;

import java.util.Scanner;

/*
 * while문을 써서 -1이 입력될 때까지 
 * 정수를 계속 입력을 받아 합을 구하고 
 * - 1이 입력이 되면 while문을 빠져나와
 * 평균을 구하는 프로그램을 만들자.
 */
public class whileExam_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0; // 입력된 정수의 개수가 저장됨
		int sum = 0; // 합이 저장될 변수
		
		System.out.println("계속적으로 정수를 입력을 하고 마지막에 -1을 입력하세요.");
		int i =  sc.nextInt();
		while(i != -1) {
//			sum = sum + i;  
			sum += i;
			count++;
			i = sc.nextInt();
		}
		System.out.println("입력된 정수의 개수는 "+count+"입니다.");
		System.out.println("입력된 정수의 평균은 "+(double)(sum/count)+"입니다.");
		sc.close();

	}

}
