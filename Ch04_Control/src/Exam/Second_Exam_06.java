package Exam;

import java.util.Scanner;

public class Second_Exam_06 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("***coffee 메뉴***");
		System.out.println("1. 아메리카노 - 3000원");
		System.out.println("2. 카페라떼 - 4000원");
		System.out.println("3. 마끼아또 - 4500원");
		System.out.println("4. 바닐라라떼 - 4500원");
		
		System.out.print("위 메뉴 중 하나를 고르세요: ");
		int select = sc.nextInt();
		int price = 0;
		switch(select) { //커피 종류가 저장될 String(문자열)변수 사용 방법도 있음, 마찬가지로 커피 가격도 미리 초기화 할 수 있음
		case 1:
					System.out.println("주문한 메뉴: 아메리카노");
					price = price +3000;
					break;
		
		case 2: 
					System.out.println("주문한 메뉴: 카페라떼");
					price = price +4000;
					break;
		
		case 3: 
					System.out.println("주문한 메뉴: 마끼아또");
					price = price +4500;
		         	break;
		case 4: 
					System.out.println("주문한 메뉴: 바닐라라떼");
					price = price +4500;
					break;
		default: 
					System.err.println("번호 1~4 중에서 골라주세요.");
								}
		System.out.print("주문 수량: ");
		int amount = sc.nextInt();
		System.out.print("입금액: ");
		int money = sc.nextInt();
		double total = (int)(price*amount)+((price*amount)*0.1);
		
		
		System.out.println("커피단가: "+price+"원");
		System.out.println("주문수량: "+ amount);
		System.out.println("입금액: "+money+"원");
		System.out.println("총금액: "+total+"원");
		System.out.println("거스름돈: "+(money-total)+"원");
		// "%,d\n", (not +)
		
		sc.close();
		
		
	}

}
