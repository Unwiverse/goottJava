package Exam;

import java.util.Scanner;

public class ClassExam_05_01 {

	// 클래스(정적-static) 멤버 선언
	public static final double TAX_RATE = 1.1;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴는 몇 개 인가요? : ");
		
		ClassExam_05[] receipts = new ClassExam_05[sc.nextInt()];
		
		// 메뉴와 단가, 수량을 키보드로 입력을 받아서 
		// 객체에 저장을 해 주면 된다.
		for(int i=0; i<receipts.length; i++) {
			
			System.out.println((i+1) +" 번째 메뉴의 이름, 단가, 수량을 입력하세요...");
			
			receipts[i] = new ClassExam_05(sc.next(), sc.nextInt(), sc.nextInt());
		
		}
		
		System.out.println();
		
		int totalPrice = 0;        // 총금액 변수
		
		System.out.println("----------------------------------");
		System.out.println("품명\t단가\t수량\t금액");
		System.out.println("----------------------------------");
		
		for(int i=0; i<receipts.length; i++) {
			
			System.out.printf("%s\t%,d\t%,d\t%,d원\n",
					receipts[i].name, receipts[i].unitPrice,
					receipts[i].amount, 
					(receipts[i].unitPrice * receipts[i].amount));
			
			totalPrice += (receipts[i].unitPrice * receipts[i].amount);
		}
		
		// 공급가액 = 총금액(totalPrice) / 부가세율
		int supplyPrice = (int)(totalPrice / ClassExam_05_01.TAX_RATE);
		
		// 부가세액 = 총금액(totalPrice) - 공급가액(supplyPrice)
		int vat = totalPrice - supplyPrice;
		
		System.out.println("----------------------------------");
		System.out.printf("공급가액\t\t\t%,d원\n", supplyPrice);
		System.out.printf("부가세액\t\t\t%,d원\n", vat);
		System.out.println("----------------------------------");
		System.out.printf("청구금액\t\t\t%,d원\n", totalPrice);
		
		sc.close();
		
	}

}

