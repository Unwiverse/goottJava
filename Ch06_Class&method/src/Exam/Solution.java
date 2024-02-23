package Exam;
// 백준 2480번 예제
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int[] diceNum = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		System.out.println();
		int money = 0;
		if(diceNum[0] == diceNum[1] && diceNum[1] == diceNum[2]) {
			System.out.println(10000+(diceNum[0]*1000));
		} else if(diceNum[0] == diceNum[1] || diceNum[0] == diceNum[2] ) {
			System.out.println(1000+(diceNum[0]*100));
		} else if(diceNum[1] == diceNum[2]) {
			System.out.println(1000+(diceNum[1]*100));
		}
		else {
			int max = Arrays.stream(diceNum).max().getAsInt();
		}

		
		
		
		

		


		
		
		
		sc.close();
	}

}
