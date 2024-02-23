package Exam;

import java.util.Scanner;
import java.util.Random;

public class FreeExam_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxValue =sc.nextInt();
		Random random = new Random();
		
		
		System.out.println("배열의 갯수: ");
		FreeExam[] nums = new FreeExam[sc.nextInt()];
		
		for(int i=0; i<nums.length; i++) {
			int randomNumber1 = random.nextInt(maxValue)+1;
			int randomNumber2 = random.nextInt(maxValue)+1;
			int randomNumber3 = random.nextInt(maxValue)+1;
			nums[i] = new FreeExam(randomNumber1, randomNumber2, randomNumber3); //여기부터
			System.out.println(nums[i].average);
		}
		
	}

}
