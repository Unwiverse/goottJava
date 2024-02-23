package Exam;

import java.util.Scanner;

public class IllShowYouSomeFunnyTricks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("배열 크기 설정: ");
		int[] array = new int[sc.nextInt()];
		
		for(int i = 0; i<array.length; i++) {
		array[i] += 10;
		System.out.print(array[i]+"\t");
			
			
			
			
		}

		sc.close();
	}

}
