package goott;

import java.util.Scanner;

public class Exception_06 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("정수 입력: ");
			int su = sc.nextInt();
			System.out.println("입력받은 정수: "+su);
		} catch(Exception e) {
			System.err.println("경고! 정수만 입력!");
			System.err.println("예외 정보: "+e);
		} finally {
			//입출력과 관련된 데이터 처리 코드
			sc.close();
		}

		System.out.println("프로그램 종료");
		
		sc.close();

	}

}
