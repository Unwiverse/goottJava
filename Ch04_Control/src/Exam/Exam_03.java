package Exam;

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입금액 입력:  ");
		long account = sc.nextLong();
		System.out.print("상품 단가 입력:  ");
		long price = sc.nextLong();
		System.out.print("상품 수량 입력:  ");
		long hm = sc.nextLong();
		
		System.out.println("지불한 금액: "+account);
		System.out.println("제품단가: "+price);
		System.out.println("수량: "+hm);
		System.out.println("부가세: "+((price*hm)*0.1));//0.1때문에 long(int) 자료형 선언 불가 double로 먼저 선언해주고 int로 변환해주기
		System.out.println("상품총액: "+((price*hm)+(price*hm)*0.1));
		System.out.println("거스름돈: "+(account-(price*hm)-((price*hm)*0.1)));
		sc.close();
	} 

}
