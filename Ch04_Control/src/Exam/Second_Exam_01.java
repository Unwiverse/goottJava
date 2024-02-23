package Exam;

import java.util.Scanner;

public class Second_Exam_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
//		System.out.print("지방의 그램을 입력하세요: ");
//		int fat = sc.nextInt();
//		
//		System.out.print("탄수화물의 그램을 입력하세요: ");
//		int carb = sc.nextInt();
//		
//		System.out.print("단백질의 그램을 입력하세요: ");
//		int prot = sc.nextInt();
//		
//		System.out.printf("총칼로리: %,d cal", ((fat*9)+(carb*4)+(prot*4)));
//		
//		
//		sc.close();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("지방의 그램을 입력하세요: ");
		int fat = sc1.nextInt();
		
		System.out.println("탄수화물의 그램을 입력하세요: ");
		int carb = sc1.nextInt();
		
		System.out.println("단백질의 그램을 입력하세요: ");
		int protein = sc1.nextInt();
		
		//총 칼로리 = 지방*9 + 단백질*4 + 탄수화물*4
		
		int total = (fat*9) + (carb*4) + (protein*4);
		System.out.printf("총 칼로리: %,dcal\n", total);


	}

}
