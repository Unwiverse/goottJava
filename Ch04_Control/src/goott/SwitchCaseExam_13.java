package goott;

import java.util.Scanner;

public class SwitchCaseExam_13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("정수 하나를 입력하세요: ");
		int su= sc.nextInt();
		
		switch(su % 5) {
		case 0:
			System.out.println("입력받은"+su+"는 5의 배수입니다.");
			break;
		case 1:
			System.out.println("입력받은"+su+"는 5의 배수가 아닙니다. 1이 남습니다.");
			break;
		case 2:
			System.out.println("입력받은"+su+"는 5의 배수가 아닙니다. 2가 남습니다.");
			break;
		case 3:
			System.out.println("입력받은"+su+"는 5의 배수가 아닙니다. 3이 남습니다.");
			break;
		case 4:
			System.out.println("입력받은"+su+"는 5의 배수가 아닙니다. 4가 남습니다.");
			break;
		}
		sc.close();
	}

}
