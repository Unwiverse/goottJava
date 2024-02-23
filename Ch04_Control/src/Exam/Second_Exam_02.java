package Exam;

import java.util.Scanner;

public class Second_Exam_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	System.out.print("수 입력: ");
		
		int oddSum = 0;
		int evenSum=0;
	    int num = sc.nextInt();
	
		for(int i=1; i<=num; i++) {
		if(i%2==1) {
			oddSum += i;
		} else {
			evenSum +=i;
			}
		}
		System.out.println("홀수 합계: "+oddSum);
		System.out.println("짝수 합계: "+evenSum);
		sc.close();
		
	}
}

