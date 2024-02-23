package Exam;

import java.util.Scanner;

public class Exam_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 숫자 4자리 입력: ");
		int i = sc.nextInt();
		
//		int money5000, money1000, money500, money10o, money50, money10, money1;
//     깃허브에서 예제 풀이 참조
		/*
		 * money5000 = i/5000;
		 * money1000 =(i % 5000)/1000
		 * money500 = (((i%5000)%1000)/500))
		 * money100 = ((((i%5000)%1000)%500)/100))
		 * money50 = (((((i%5000)%1000)%500)%100)/50))
		 * money10 = ((((((i%5000)%1000)%500)%100)%50)/10))
		 * money1 = (((((((i%5000)%1000)%500)%100)%50)%10)/1))
		 */
		
		System.out.println("입력받은 숫자==> "+i);
		System.out.println("오천원 지폐: "+(i/5000)+"장");
		System.out.println("천원 지폐: "+((i%5000)/1000)+"장");
		
		System.out.println("오백원 동전: "+(((i%5000)%1000)/500)+"개") ;
		System.out.println("백원 동전: "+((((i%5000)%1000)%500)/100)+"개");
		System.out.println("오십원 동전: "+(((((i%5000)%1000)%500)%100)/50)+"개");
		System.out.println("십원 동전: "+((((((i%5000)%1000)%500)%100)%50)/10)+"개");
		System.out.println("일원 동전: "+(((((((i%5000)%1000)%500)%100)%50)%10)/1)+"개");
	
		System.out.println();
		sc.close();
		
		

	}

}