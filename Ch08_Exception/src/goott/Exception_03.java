package goott;

import java.util.Scanner;

public class Exception_03 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int su = sc.nextInt();
		System.out.println("입력받은 정수: "+su);
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
