package Exam;

import java.util.Scanner;

public class Shape_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("도형을 선택하세요(1.원형 2. 사각형)");
		int oneortwo = sc.nextInt(); 
		System.out.println("도형 선택: "+oneortwo);
		if(oneortwo == 1) {
			System.out.println("반지름 입력: ");
			Circle circle = new Circle(sc.nextInt());
			System.out.println("::::::::::::::::::::::::::::::::::::");
			System.out.println("원의 넓이: "+circle.findArea());
		} else if(oneortwo == 2) {
			System.out.println("가로: ");
			System.out.println("세로: ");
			Rectangle rectangle = new Rectangle(sc.nextInt(), sc.nextInt());
			System.out.println("::::::::::::::::::::::::::::::::::::");
			System.out.printf("사각형 넓이: %.1f\n", rectangle.findArea());
		} else {
			System.err.println("잘못된 입력");
		} sc.close();
	}

}
