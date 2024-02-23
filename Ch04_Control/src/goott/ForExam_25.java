package goott;

import java.util.Scanner;

public class ForExam_25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력받을 최대 정수: ");
		int oddSum = 0;
		int evenSum = 0;
		int max  =sc.nextInt();
		
		for(int i =1; i<=max; i++) {
			if(i%2 ==1) {
				oddSum += i;//oddSum
			} else {
				evenSum += i;//evemSum
			}
		}
		System.out.println(max+" 까지의 홀수 합: "+oddSum);
		System.out.println(max+" 까지의 짝수 합"+evenSum);
	}

}
