package classes;

import java.util.Scanner;

public class Drink_02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("자판기 음료 개수: ");
		//객체 배열 선언 및 객체 배열 메모리 할당
		Drink[] vendor = new Drink[sc.nextInt()]; //클래스 배열(객체 여러개)
		
		for(int i=0; i<vendor.length; i++) {
			System.out.println("음료 이름과 가격을 입력하세요: ");
			System.out.println("====================== ");
			vendor[i] = new Drink(sc.next(), sc.nextInt());
		}
		System.out.println();
		System.out.println("금액 투입: ");
		int coin  =sc.nextInt();
		
		/*
		 * 입력을 받은 coin(돈)과 객체 배열에 저장된 Drink 클래시의 멤버변수인 price(가격)을 비교해서 가격이
		 * 작거나 같은 음료 선택 ==> 반복문 사용
		 */
		for(int i=0; i<vendor.length; i++) {
			if(coin >= vendor[i].price) {
				System.out.println(vendor[i].name+"\t");
			}
		}
		sc.close();
//		vendor[0] = new Drink("콜라", 2500);
//		vendor[1] = new Drink("사이다", 2500);
//		vendor[2] = new Drink("옥수수수염차", 2000);
//		vendor[3] = new Drink("17차", 1800);
//		vendor[4] = new Drink("몬스터", 2300);
//		vendor[5] = new Drink("킨사이다", 1500);
		
//객체 배열의 코드를 풀어서 본다면 아래와 같음
//			Drink vendor1 = new Drink("콜라", 2500);
//			Drink vendor2 = new Drink("사이다", 2500);
//			Drink vendor3 = new Drink("옥수수수염차", 2000);
//			Drink vendor4 = new Drink("17차", 1800);
//			Drink vendor5 = new Drink("몬스터", 2300);
//			Drink vendor6 = new Drink("킨사이다", 1500);
			
//			vendor[0] = vendor1; vendor[1] =vendor2;
//			vendor[2] =vendor3; vendor[3] = vendor4;    //←←←← 각 배열에 주소값이 배정되는 순서
//			vendor[4]=vendor5; vendor[5] = vendor6;  
		
//			System.out.println(vendor[0]);
//			System.out.println(vendor[1]); //일반 배열에서는 배정된 주소값에 가면 바로 값이 있었지만 객체 배열은 인덱스에 주소값이 배정된다.
//			System.out.println(vendor[2]);
//			System.out.println(vendor[3]);
//			System.out.println(vendor[4]);
//			System.out.println(vendor[5]);
		

		}

}
